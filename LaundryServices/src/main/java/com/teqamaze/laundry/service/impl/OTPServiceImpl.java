package com.teqamaze.laundry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teqamaze.laundry.constant.RandomCodeAndOTP;
import com.teqamaze.laundry.constant.UserType;
import com.teqamaze.laundry.dao.OtpDao;
import com.teqamaze.laundry.dao.UserDao;
import com.teqamaze.laundry.dao.VendorDao;
import com.teqamaze.laundry.dto.OTP;
import com.teqamaze.laundry.dto.User;
import com.teqamaze.laundry.dto.Vendor;
import com.teqamaze.laundry.error.LaundryError;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.OTPService;

@Service
public class OTPServiceImpl implements OTPService {
    OTP otp = new OTP();

    @Autowired
    OtpDao otpDao;

    @Autowired
    UserDao userDao;

    @Autowired
    VendorDao vendorDao;

    UserType userType;

    @Override
    public OTP createOtp(String mobileNo, String userType) throws LaundryException {
        if (mobileNo.isEmpty() || mobileNo == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_NUMBER_INVALID);
        }
        OTP otp = new OTP();
        otp.setMobileNo(mobileNo);
        otp.setCreate_time(System.currentTimeMillis());
        otp.setExpiry_time(System.currentTimeMillis() + 500000);
        otp.setVerificationCode(RandomCodeAndOTP.genetrateOTP(6));
        otpDao.save(otp);
        // TODO: Send sms and email for this generated OTP.
        return otp;
    }

    @Override
    public boolean verifyOtp(String mobileNo, String verificationCode) throws LaundryException {
        if (mobileNo == null || mobileNo.trim().length() < 10) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_NUMBER_INVALID);
        }
        if (verificationCode == null || verificationCode.trim().length() <= 0) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_NULL_OTP);
        }

        OTP otp = otpDao.findByMobileNumber(mobileNo, verificationCode);

        if (otp == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_INVALID_OTP);
        }

        // TODO: if customer type is user, then set to user db otherwise set to vendor

        if ((otp.getExpiry_time() >= System.currentTimeMillis())) {

            UserType userType = UserType.valueOf("VENDOR");

            if (userType == UserType.USER) {

                List<User> listUser = userDao.findByMobileNo(mobileNo);
                if (listUser != null && !listUser.isEmpty()) {
                    for (User user : listUser) {
                        user.setMobileVerified(true);
                        userDao.save(user);
                    }
                } else {
                    User user = new User();
                    user.setMobileNo(mobileNo);
                    user.setMobileVerified(true);
                    userDao.save(user);
                }

            } else if (userType == UserType.VENDOR) {
                Vendor vendor = vendorDao.findByMobileNo(mobileNo);
                if (vendor != null) {

                    vendor.setMobileVerified(true);
                    vendorDao.save(vendor);
                } else {
                    Vendor vendor1 = new Vendor();
                    vendor1.setMobileNo(mobileNo);
                    vendor1.setMobileVerified(true);
                    vendorDao.save(vendor1);
                }
            }
        } else {
            otpDao.delete(otp);
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_EXPIRED_OTP);
        }
        otpDao.delete(otp);
        return true;
    }
}

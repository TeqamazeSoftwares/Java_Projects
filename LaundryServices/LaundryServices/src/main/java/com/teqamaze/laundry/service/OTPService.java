package com.teqamaze.laundry.service;

import com.teqamaze.laundry.dto.OTP;
import com.teqamaze.laundry.exception.LaundryException;

public interface OTPService {

    public OTP createOtp(String mobileNo, String userType) throws LaundryException;
    
    public boolean verifyOtp(String mobileNo, String verificationcode) throws LaundryException;
    
    
}

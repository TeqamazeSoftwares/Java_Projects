package com.teqamaze.laundry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teqamaze.laundry.dto.ApiResponse;
import com.teqamaze.laundry.dto.OTP;
import com.teqamaze.laundry.dto.OTPRequest;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.OTPService;
import com.teqamaze.laundry.util.ApiResponseUtil;

@RestController
@RequestMapping("/otp")
public class OTPController {

    private static final Logger LOGGER = LoggerFactory.getLogger(OTPController.class);

    @Autowired
    OTPService userVerification;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public OTP sendOtp(@RequestBody OTPRequest otpSystem) throws LaundryException {
          LOGGER.info("creating the OTP in specified number");
        OTP otp = userVerification.createOtp(otpSystem.getMobileNo(), otpSystem.getUserType());
        return otp;
    }

    @RequestMapping(value = "/verify", method = RequestMethod.POST)
    public ApiResponse verifyOtp(@RequestBody OTPRequest otpSystem) throws LaundryException {
        LOGGER.info("verifying the OTP with given number and verification code");

        userVerification.verifyOtp(otpSystem.getMobileNo(), otpSystem.getVerificationCode());
        
     return ApiResponseUtil.success();

    }
}

package com.teqamaze.laundry.dto;

public class OTPRequest {

    private String mobileNo;
    private String verificationCode;
    private String userType;

    public OTPRequest() {
        super();
    }

    public OTPRequest(String mobileNo, String verificationCode, String userType) {
        super();
        this.mobileNo = mobileNo;
        this.verificationCode = verificationCode;
        this.userType = userType;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}

package com.teqamaze.laundry.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection ="verification")
public class OTP {

    @Id
    private String id;
    
    @Field("mobileNo")
    private String mobileNo;
    
    @Field("verificationCode")
    private String verificationCode;
    
    @Field("expiry-time")
    private long expiry_time;
    
    @Field("create_time")
    private long create_time;
    
    public OTP() {
        super();
    }
    
    
    public OTP(String id,String mobileNo, String verificationCode, long expiry_time, long create_time) {
        super();
        this.mobileNo = mobileNo;
        this.verificationCode = verificationCode;
        this.expiry_time = expiry_time;
        this.create_time = create_time;
    }


    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
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

    public long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(long create_time) {
        this.create_time = create_time;
    }
    public long getExpiry_time() {
        return expiry_time;
    }
    public void setExpiry_time(long expiry_time) {
        this.expiry_time = expiry_time;
    }
    
    
}

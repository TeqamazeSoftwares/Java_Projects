package com.teqamaze.laundry.dto;

import java.util.Arrays;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user")
@TypeAlias("userProfile")
public class User {

    @Id
    @Field("id")
    private String id;

    //@NotNull
    @Field("username")
    @Indexed
    private String username;
   
    @Email
    @Field("email")
    private String email;

    @Field("image")
    private byte[] image;

    @Field("vendorId") 
    @Indexed
    private String vendorId;
    
    @Field("vendorCode")
    private String vendorCode;

    //@NotNull
    @Field("mobileNo")
    @Indexed
    private String mobileNo;
    
    @Field("alternateMob")
    @Indexed
    private String alternateMob;

    @Field("status")
    private String status;

    @Field("createTs")
    private String createTs;

    @Field("updateTs")
    private String updateTs;
    
    @Field("isMobileverified")
    private boolean isMobileVerified = false;

    @Field("Address")
    private Address address;
    
    private Vendor vendor;
 
    public User() {
        
    }

    public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}



public String getUserName() {
    return username;
}



public void setUserName(String username) {
    this.username = username;
}



public String getEmail() {
    return email;
}



public void setEmail(String email) {
    this.email = email;
}



public byte[] getImage() {
    return image;
}



public void setImage(byte[] image) {
    this.image = image;
}



public String getVendorId() {
    return vendorId;
}



public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
}



public String getVendorCode() {
    return vendorCode;
}



public void setVendorCode(String vendorCode) {
    this.vendorCode = vendorCode;
}



public String getMobileNo() {
    return mobileNo;
}



public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
}



public String getAlternateMobileNo() {
    return alternateMob;
}



public void setAlternateMobileNo(String alternateMob) {
    this.alternateMob = alternateMob;
}



public String getStatus() {
    return status;
}



public void setStatus(String status) {
    this.status = status;
}



public String getCreateTs() {
    return createTs;
}



public void setCreateTs(String createTs) {
    this.createTs = createTs;
}



public String getUpdateTs() {
    return updateTs;
}



public void setUpdateTs(String updateTs) {
    this.updateTs = updateTs;
}



public boolean isMobileVerified() {
    return isMobileVerified;
}



public void setMobileVerified(boolean isMobileVerified) {
    this.isMobileVerified = isMobileVerified;
}



public Address getAddress() {
    return address;
}



public void setAddress(Address address) {
    this.address = address;
}



public Vendor getVendor() {
    return vendor;
}



public void setVendor(Vendor vendor) {
    this.vendor = vendor;
}

@Override
public String toString() {
    return "User [id=" + id + ", userName=" + username + ", email=" + email + ", image=" + Arrays.toString(image)
            + ", vendorId=" + vendorId + ", vendorCode=" + vendorCode + ", mobileNo=" + mobileNo
            + ", alternateMobileNo=" + alternateMob+ ", status=" + status + ", createTs=" + createTs
            + ", updateTs=" + updateTs + ", isMobileVerified=" + isMobileVerified + ", address=" + address + ", vendor="
            + vendor + "]";
}



}

package com.teqamaze.laundry.dto;


public class Address {
   
    private String fullAddress;
    
    private String pincode;
    
    private Double latitude;
    
    private Double longitude;
    
    
   
    public Address() {
        
    }



    public String getAddress() {
        return fullAddress;
    }



    public void setAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }



    public String getPinCode() {
        return pincode;
    }



    public void setPinCode(String pinCode) {
        this.pincode = pinCode;
    }



    public Double getLatitude() {
        return latitude;
    }



    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }



    public Double getLongitude() {
        return longitude;
    }



    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }



    @Override
    public String toString() {
        return "Address [address=" + fullAddress + ", pinCode=" + pincode + ", latitude=" + latitude + ", longitude="
                + longitude + "]";
    }

    
}

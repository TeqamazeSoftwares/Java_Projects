package com.teqamaze.laundry.dto;


public class Temp {
   
    private String vendorCode;
    
    private String pinCode;
       
    public Temp() {
        
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Temp [vendorCode=" + vendorCode + ", pinCode=" + pinCode + "]";
    }
    
    
}

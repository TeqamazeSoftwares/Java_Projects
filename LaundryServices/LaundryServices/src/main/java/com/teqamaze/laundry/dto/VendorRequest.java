package com.teqamaze.laundry.dto;

public class VendorRequest {

    private String vendorId;
    private String vendorCode;
    
    VendorRequest(String vendorId,String vendorCode){
        this.vendorCode = vendorCode;
        this.vendorId = vendorId;        
    }
    
    public VendorRequest() {
        super();
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
    @Override
    public String toString() {
        return "VendorRequest [vendorId=" + vendorId + ", vendorCode=" + vendorCode + "]";
    }
    
    
}

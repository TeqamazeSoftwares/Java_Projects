package com.teqamaze.laundry.dto;

public class VendorAddressRequest {

    private  VendorAddress address;

    public VendorAddressRequest()
    {
        super();
    }
    
    public VendorAddress getAddress() {
        return address;
    }

    public void setAddress(VendorAddress address) {
        this.address = address;
    }
}

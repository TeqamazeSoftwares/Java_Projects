package com.teqamaze.laundry.dto;

import com.teqamaze.laundry.constant.VendorServicesType;

public class ItemCart {

    private String quantity;
    private VendorServicesType serviceType;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }


    public VendorServicesType getServiceType() {
        return serviceType;
    }

    public void setServiceType(VendorServicesType serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "ItemCart [quantity=" + quantity + ", serviceType=" + serviceType + "]";
    }


}

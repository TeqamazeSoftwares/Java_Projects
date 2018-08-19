package com.teqamaze.laundry.dto;

import java.util.List;

import com.teqamaze.laundry.constant.VendorServicesType;

public class VendorServicesResponse {

    private List<VendorServicesType> services;

    public VendorServicesResponse(List<VendorServicesType> services) {
        this.services = services;
    }

    public List<VendorServicesType> getServices() {
        return services;
    }

    public void setServices(List<VendorServicesType> services) {
        this.services = services;
    }
}

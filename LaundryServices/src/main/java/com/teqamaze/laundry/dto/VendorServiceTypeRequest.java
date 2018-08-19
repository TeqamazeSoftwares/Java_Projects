package com.teqamaze.laundry.dto;

import java.util.List;

import com.teqamaze.laundry.constant.VendorServicesType;


public class VendorServiceTypeRequest {

    private List<VendorServicesType> services;

    public VendorServiceTypeRequest() {
        super();
    }

    public List<VendorServicesType> getServices() {
        return services;
    }

    public void setServices(List<VendorServicesType> services) {
        this.services = services;
    }

  
    
    
}

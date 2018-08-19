package com.teqamaze.laundry.constant;

import java.io.Serializable;

public enum VendorServicesType implements Serializable {
    WASH,
    IRON,
    DRYCLEAN,
    WASH_AND_FOLD,
    WASH_AND_IRON;
    
    @Override
    public String toString() {
        return this.name();
    }
    
    public Object toJSON() {
        return this.name();
        
    }
}

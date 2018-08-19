package com.teqamaze.laundry.dto;

public class Household {

    private String name;
    private String code;
    
    public Household() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ClassPojo [name = " + name + ", code = " + code + "]";
    }
}

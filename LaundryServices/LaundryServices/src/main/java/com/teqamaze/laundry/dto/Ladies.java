package com.teqamaze.laundry.dto;

public class Ladies {

    private String name;
    private String code;
    
    public Ladies() {
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

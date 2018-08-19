package com.teqamaze.laundry.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class VendorAddress {

    private String street;

    private String landmark;

    private String city;

    private String state;

    private String pinCode;

    private Double latitude;

    private Double longitude;

    public VendorAddress() {
        super();
    }

    public VendorAddress(String street, String landmark, String city, String state, String pinCode, Double latitude,
            Double longitude) {
        super();
        this.street = street;
        this.landmark = landmark;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
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
        return "VendorAddress [street=" + street + ", landmark=" + landmark + ", city=" + city + ", state=" + state
                + ", pinCode=" + pinCode + "]";
    }

}

package com.teqamaze.laundry.dto;

public class ItemCode
{
    private String washingRate;

    private String dryClean;

    private String washingAndIronRate;

    public String getWashingRate ()
    {
        return washingRate;
    }

    public void setWashingRate (String washingRate)
    {
        this.washingRate = washingRate;
    }

    public String getDryClean ()
    {
        return dryClean;
    }

    public void setDryClean (String dryClean)
    {
        this.dryClean = dryClean;
    }

    public String getWashingAndIronRate ()
    {
        return washingAndIronRate;
    }

    public void setWashingAndIronRate (String washingAndIronRate)
    {
        this.washingAndIronRate = washingAndIronRate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [washingRate = "+washingRate+", dryClean = "+dryClean+", washingAndIronRate = "+washingAndIronRate+"]";
    }
}
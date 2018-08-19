package com.teqamaze.laundry.dto;

import java.util.List;

public class RateCard {

    private List<PerItemAndKG> perItem;
    private List<PerItemAndKG> perKg;

    public List<PerItemAndKG> getPerItem() {
        return perItem;
    }

    public void setPerItem(List<PerItemAndKG> perItem) {
        this.perItem = perItem;
    }

    public List<PerItemAndKG> getPerKg() {
        return perKg;
    }

    public void setPerKg(List<PerItemAndKG> perKg) {
        this.perKg = perKg;
    }

    @Override
    public String toString() {
        return "RateCard [perItem=" + perItem + ", perKg=" + perKg + "]";
    }

}
package com.teqamaze.laundry.dto;

import java.util.List;

public class Cart {

    private List<CartItemsPerKg> perItem;
    private List<CartItemsPerKg> perKg;
    
    
    public List<CartItemsPerKg> getPerItem() {
        return perItem;
    }
    public void setPerItem(List<CartItemsPerKg> perItem) {
        this.perItem = perItem;
    }
    public List<CartItemsPerKg> getPerKg() {
        return perKg;
    }
    public void setPerKg(List<CartItemsPerKg> perKg) {
        this.perKg = perKg;
    }
    @Override
    public String toString() {
        return "Cart [perItem=" + perItem + ", perKg=" + perKg + "]";
    }

    
}

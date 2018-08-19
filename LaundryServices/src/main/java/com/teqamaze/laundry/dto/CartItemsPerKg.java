package com.teqamaze.laundry.dto;

public class CartItemsPerKg {

    ItemCart itemCode;

    public ItemCart getItemCode() {
        return itemCode;
    }

    public void setItemCode(ItemCart itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "CartItemsPerKg [itemCode=" + itemCode + "]";
    }

}

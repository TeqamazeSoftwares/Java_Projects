package com.teqamaze.laundry.dto;

public class PerItemAndKG {
    
    ItemCode itemCode;

    public ItemCode getItemCode() {
        return itemCode;
    }

    public void setItemCode(ItemCode itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public String toString() {
        return "PerItemAndKG [itemCode=" + itemCode + "]";
    }
    
    

}

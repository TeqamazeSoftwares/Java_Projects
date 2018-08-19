package com.teqamaze.laundry.dto;

public class PerItem
{
   private ItemCode itemCode;

    public ItemCode getItemCode ()
    {
        return itemCode;
    }

    public void setItemCode (ItemCode itemCode)
    {
        this.itemCode = itemCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [itemCode = "+itemCode+"]";
    }
}
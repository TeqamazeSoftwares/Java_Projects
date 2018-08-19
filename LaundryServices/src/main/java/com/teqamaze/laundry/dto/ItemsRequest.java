package com.teqamaze.laundry.dto;

import java.util.List;

public class ItemsRequest {

    private List<ItemsDTO> itemsList;

    /*public ItemsRequest() {
        super();
    }*/
    

    public ItemsRequest(List<ItemsDTO> itemsList) {
        this.itemsList = itemsList;
    }


    public List<ItemsDTO> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<ItemsDTO> itemsList) {
        this.itemsList = itemsList;
    }
    
    
}

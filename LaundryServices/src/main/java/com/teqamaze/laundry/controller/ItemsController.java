package com.teqamaze.laundry.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teqamaze.laundry.dto.ItemsDTO;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.ItemsService;

@RestController
@RequestMapping("/items")
public class ItemsController {
    
    @Autowired
    ItemsService itemsService;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(ItemsController.class);
    
    // To get all users profile
    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<ItemsDTO> getItems() throws LaundryException {
        LOGGER.info("Get all items");
        List<ItemsDTO> items = itemsService.getAllServices();
        
        return items;
    }
    
}

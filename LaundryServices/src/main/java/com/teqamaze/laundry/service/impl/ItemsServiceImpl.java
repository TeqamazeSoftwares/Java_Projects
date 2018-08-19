package com.teqamaze.laundry.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teqamaze.laundry.dao.ItemsDao;
import com.teqamaze.laundry.dto.ItemsDTO;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ItemsServiceImpl.class);
        
    @Autowired
    ItemsDao itemsDao;
    
    @Override
    public List<ItemsDTO> getAllServices() throws LaundryException {
        List<ItemsDTO> items = new ArrayList<>();
        LOGGER.info("getting the all user order details : ");   
        items = (List<ItemsDTO>) itemsDao.findAll();
        return items;
    }

}

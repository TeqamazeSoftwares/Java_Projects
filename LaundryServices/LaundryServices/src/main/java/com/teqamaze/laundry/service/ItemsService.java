package com.teqamaze.laundry.service;

import java.util.List;

import com.teqamaze.laundry.dto.ItemsDTO;
import com.teqamaze.laundry.exception.LaundryException;

public interface ItemsService {

    public List<ItemsDTO> getAllServices() throws LaundryException;
}

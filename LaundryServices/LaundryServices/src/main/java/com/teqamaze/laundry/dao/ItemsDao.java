package com.teqamaze.laundry.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teqamaze.laundry.dto.ItemsDTO;

@Repository
public interface ItemsDao extends CrudRepository<ItemsDTO, String>{

}

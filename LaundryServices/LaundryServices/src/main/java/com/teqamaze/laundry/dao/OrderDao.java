package com.teqamaze.laundry.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teqamaze.laundry.dto.Order;

@Repository
public interface OrderDao extends CrudRepository <Order, String> {

  @Query(" { 'vendorId' : ?0} ")
  List<Order> findOrderByVendorId(String vendorId);  
  
  @Query(" { 'userId' : ?0} ")
  List<Order> findOrderByUserId(String userId);
}

package com.teqamaze.laundry.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teqamaze.laundry.dto.User;

/**
 * @author Administrator
 *
 */
@Repository
public interface UserDao extends CrudRepository <User, String> {

 public User findById ( String id);
 
  @Query("{ 'username' : ?0 }")
  List<User> findUsersByName(String username);
  
  @Query("{'address.city': ?0}")         
  List<User> findByCity(final String city);
  
  @Query(" {'mobileNo' : ?0} ")
  List<User> findByMobileNo(String mobileNo);
  
  @Query(" { 'vendorId' : ?0} ")
  User findByVendorId(String vendorId);
  
  @Query(" { 'vendorCode' : ?0} ")
  User findByVendorCode(String vendorCode);
  

  /*
    @Query(" {'user.vendorId': null}")
  Boolean findVendorInUserIsNull(String userId);
  
  */
  
/*
public void save(Address address);

public void save(String userId);

Address findOne(User userId);
  
  */
}

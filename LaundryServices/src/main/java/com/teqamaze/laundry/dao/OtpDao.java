package com.teqamaze.laundry.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.teqamaze.laundry.dto.OTP;

public interface OtpDao extends CrudRepository<OTP ,String>
{

    
    @Query(value = "{ 'mobileNo' : ?0 }, { 'verificationCode' : ?1 } ")
      OTP findByMobileNumber(String mobileNo, String verificationCode);
}

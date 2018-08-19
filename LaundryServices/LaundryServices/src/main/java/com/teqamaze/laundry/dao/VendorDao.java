package com.teqamaze.laundry.dao;

import java.util.List;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.teqamaze.laundry.dto.Vendor;

public interface VendorDao extends CrudRepository<Vendor, String> {

    List<Vendor> findAll();

    @Query("{ 'name' : ?0 }")
    List<Vendor> findVendorsByName(String name);

    @Query("{'address.city': ?0}")
    List<Vendor> findByCity(final String city);

    @Query(" {'pinCode' : ?0} ")
    List<Vendor> findByPinCode(String pincode);

    @Query(" {'vendorCode' : ?0} ")
    Vendor findByCode(String vendorCode);
    
    @Query(" {'vendorCode':?0 } or {'pinCode':?1 } ")
    List<Vendor> findByCodeOrPinCode(String vendorCode, String pinCode);

    @Query(" {'id' : ?0} ") 
    Vendor findVendorById(String vendorId);

    @Query(" {'id' : ?0} ")
    Vendor save(Vendor vendor, String id);
    
    @Query(" {'mobileNo' : ?0} ")
    Vendor findByMobileNo(String mobileNo);
    
    
  /*  
    @Query(" {'id' : ?0} ")
    public void deleteServices(String id);
    */
  
    
}

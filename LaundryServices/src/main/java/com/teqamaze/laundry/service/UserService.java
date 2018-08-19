package com.teqamaze.laundry.service;

import java.util.List;

import com.teqamaze.laundry.dto.AddressRequest;
import com.teqamaze.laundry.dto.User;
import com.teqamaze.laundry.dto.VendorRequest;
import com.teqamaze.laundry.exception.LaundryException;

public interface UserService {

    // User methods---------

    public User save(User user);

    public User getUser(String id) throws LaundryException;

    List<User> getAllUsers() throws LaundryException;

    public void deleteUser(String id) throws LaundryException;

    public User update(User user, String id);

    public User updateUserByVendorId(String userId, VendorRequest vendorRequest) throws LaundryException;
    
    public User updateUserAddress(AddressRequest addRequest, String id) throws LaundryException;
    
    public User getUserAddress(String id) throws LaundryException;


    
    /*
     * // Address methods ------
     * 
     * Address saveAddress(String userId );
     * 
     * Address getuserAddress( String userId);
     * 
     * List< Address> getAllAddress(String userId);
     * 
     * void deleteUserAddress( String userId) throws LaundryException;
     * 
     * Address updateAddress(Address address, String userId);
     * 
     * 
     */

}

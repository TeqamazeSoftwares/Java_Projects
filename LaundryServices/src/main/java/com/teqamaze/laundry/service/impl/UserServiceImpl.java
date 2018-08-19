package com.teqamaze.laundry.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teqamaze.laundry.dao.UserDao;
import com.teqamaze.laundry.dao.VendorDao;
import com.teqamaze.laundry.dto.AddressRequest;
import com.teqamaze.laundry.dto.User;
import com.teqamaze.laundry.dto.Vendor;
import com.teqamaze.laundry.dto.VendorRequest;
import com.teqamaze.laundry.error.LaundryError;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    VendorDao vendorDao;

    // for deleting the user profile
    @Override
    public void deleteUser(String id) throws LaundryException {
        if (StringUtils.isBlank(id)) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_USER_ID_INVALID);
        }
        if (!id.equals("")) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_USER_ID_INVALID);
        }
        LOGGER.info("Deleting user having Id : " + id);
        userDao.delete(id);
    }
    // for inserting the new user Profile

    @Override
    public User save(User user) {
        LOGGER.info("Updating the user new profile : ");
        userDao.save(user);
        return user;
    }

    // for updating the user
    @Override
    public User update(User user, String id) {
        LOGGER.info("Updating the user existing Id profile: ");
        userDao.save(user);
        return user;
    }

    // updating the user with vendor id
    @Override
    public User updateUserByVendorId(String userId, VendorRequest vendorRequest) throws LaundryException {
        User user = userDao.findOne(userId);
        if (user == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_USER_NOT_FOUND);
        }
        Vendor vendor = null;
        if (!StringUtils.isBlank(vendorRequest.getVendorId())) {
            vendor = vendorDao.findOne(vendorRequest.getVendorId());
        }
        if (!StringUtils.isBlank(vendorRequest.getVendorCode())) {
            vendor = vendorDao.findByCode(vendorRequest.getVendorCode());
        }
        if (vendor == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_INVALID_VENDOR_CODE);
        }
        if (StringUtils.isBlank(user.getVendorId())) {
            user.setVendorId(vendorRequest.getVendorId());
            user.setVendorCode(vendorRequest.getVendorCode());
            userDao.save(user);
            return user;
        } else {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_ALREADY_EXIST);
        }
    }

    // get all users
    @Override
    public List<User> getAllUsers() throws LaundryException {
         List<User> userList = new  ArrayList<>();
        userDao.findAll().forEach(userList::add);
        if(userList.isEmpty() || userList == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_USER_NOT_FOUND);
        }
        return userList;
    }

    // get user by id
    @Override
    public User getUser(String id) throws LaundryException {
        
        User user = userDao.findOne(id);
        if(user == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_USER_NOT_FOUND);
        }
        return user;
    }

    @Override
    public User updateUserAddress(AddressRequest addRequest, String id) throws LaundryException {
        LOGGER.info("update the user address by user Id : " + id);
        User user = this.getUser(id);
        user.setAddress(addRequest.getAddress());
        userDao.save(user);
        return user;
    }

    @Override
    public User getUserAddress(String id) throws LaundryException {
        LOGGER.info("get the user address by user Id : " + id);
        User user = this.getUser(id);
        if (user == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_USER_ID_INVALID);
        }
        return user;
    }
    
    
    
    }




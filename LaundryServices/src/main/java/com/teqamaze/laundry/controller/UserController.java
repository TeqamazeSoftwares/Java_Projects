package com.teqamaze.laundry.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teqamaze.laundry.dto.Address;
import com.teqamaze.laundry.dto.AddressRequest;
import com.teqamaze.laundry.dto.ApiResponse;
import com.teqamaze.laundry.dto.User;
import com.teqamaze.laundry.dto.VendorRequest;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.UserService;
import com.teqamaze.laundry.util.ApiResponseUtil;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService services;

    // To get all users profile
    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<User> getUsers() throws LaundryException {
        LOGGER.info("Getting all users");
        List<User> tsl = services.getAllUsers();
         return tsl;
    }

    // To get particular user by id
 
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public User getUser(@PathVariable String id) throws LaundryException {
        LOGGER.info("Getting users by Id" + id);
        return services.getUser(id);
    }

    // To add user profile in the database by Post

    @RequestMapping(method = RequestMethod.POST, value = "")
    public ApiResponse create( @Valid @RequestBody User user) {
        LOGGER.info("Updating the new user");
        services.save(user);
        return ApiResponseUtil.success();
    }

    // To Update user profile in the database by Put

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateUser(@Valid @RequestBody User user, @PathVariable String id) {

        LOGGER.info("updating the registered users by id" + id);
        user.setId(id);
        services.update(user, id);
    }
    
    // To update User profile with Vendor Id
    @RequestMapping(value="/{id}/vendor", method = RequestMethod.PUT)
    public void updateUserById(@RequestBody VendorRequest vendorRequest, @PathVariable("id") String userId) throws LaundryException
    {
        LOGGER.info("mapping vendor with user");
        services.updateUserByVendorId(userId, vendorRequest);
    }

    // To delete user permanent from db by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteUser(@PathVariable String id) throws LaundryException {
        LOGGER.info("Deleting the user by Id" + id);
        services.deleteUser(id);
    }
    

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}/address")
    public AddressRequest updateAddress(@RequestBody AddressRequest addRequest,
            @PathVariable String id) throws LaundryException {
        LOGGER.info("update the address of the user by Id:" + id);
        services.updateUserAddress(addRequest, id);
        return addRequest;

    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}/address")
    public Address getAddress(@PathVariable String id) throws LaundryException {
        LOGGER.info("get user address by user ID:" + id);
        User user = services.getUserAddress(id);
        return user.getAddress();
    }

 
}

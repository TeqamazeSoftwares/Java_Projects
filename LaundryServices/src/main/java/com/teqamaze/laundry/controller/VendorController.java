
package com.teqamaze.laundry.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teqamaze.laundry.constant.RandomCodeAndOTP;
import com.teqamaze.laundry.constant.VendorServicesType;
import com.teqamaze.laundry.dto.ApiResponse;
import com.teqamaze.laundry.dto.RateCard;
import com.teqamaze.laundry.dto.RateCardRequest;
import com.teqamaze.laundry.dto.Vendor;
import com.teqamaze.laundry.dto.VendorAddress;
import com.teqamaze.laundry.dto.VendorAddressRequest;
import com.teqamaze.laundry.dto.VendorServiceTypeRequest;
import com.teqamaze.laundry.error.LaundryError;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.VendorServices;
import com.teqamaze.laundry.util.ApiResponseUtil;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    VendorServices services;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    // To get all vendors profile
    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<Vendor> getVendors() throws LaundryException, IOException {
        List<Vendor> vendors = services.getVendors();
        LOGGER.info("Getting all vendors");
        return vendors;
    }

    // To get particular vendor profile by id

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Vendor getVendorById(@PathVariable String id) throws LaundryException {
        LOGGER.info("Getting vendor by Id" + id);
        return services.getVendor(id);
    }

    // get vendors by pin code
    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public List<Vendor> getByZip(@RequestParam(value = "pinCode", required = false) String pinCode,
            @RequestParam(value = "vendorCode", required = false) String vendorCode) throws LaundryException {
        LOGGER.info("Getting vendor by ZipCode" + pinCode + "or By VendorCode " + vendorCode);
//        VendorSearchCriteria criteria = new VendorSearchCriteria();
//        criteria.setPinCode(pinCode);
//        criteria.setVendorCode(vendorCode);

        // TODO: create search(VendorSearchCriteria criteria);
        return services.sortVendorByCode(pinCode, vendorCode);

    }

    // To add vendor profile in the database by Post

    @RequestMapping(method = RequestMethod.POST, value = "")
    public ApiResponse create(@Valid @RequestBody Vendor vendor) throws LaundryException {

        LOGGER.info("Updating the new vendors");
        String randomCode = RandomCodeAndOTP.randomString(6);
        vendor.setVendorCode(randomCode);
        services.save(vendor);
        return ApiResponseUtil.success();
    }

    // To Update vendor profile in the database by Put

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateVendor(@Valid @RequestBody Vendor vendor, @PathVariable String id) throws LaundryException {

        LOGGER.info("updating the registered vendors by id" + id);
        if (!id.isEmpty()) {
            vendor.setId(id);
            services.updateVendor(vendor, id);
        } else {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_ID_INVALID);
        }
    }

    // To delete vendor permanent from db by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteVendor(@PathVariable String id) throws LaundryException {
        LOGGER.info("Deleting the vendor by Id" + id);
        services.deleteVendor(id);
    }

    // get services by vendor----->

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/services")
    public List<VendorServicesType> getAllServices(@PathVariable String id) {
        LOGGER.info("get vendor services by vendor ID:" + id);
        Vendor vendor = services.findVendor(id);
        return vendor.getServices();
    }

    // update services by vendor
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}/services")
    public VendorServiceTypeRequest updateVendorServices(@RequestBody VendorServiceTypeRequest vendorService,
            @PathVariable String id) throws LaundryException {
        LOGGER.info("update the services of the vendor by Id:" + id);
        services.updateServices(vendorService, id);
        return vendorService;

    }

    // vendor rate card methods---->

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/rates")
    public RateCard getAllItemsRates(@PathVariable String id) throws LaundryException {
        LOGGER.info("get vendor items by vendor ID:" + id);
        Vendor vendor = services.getItemsRate(id);
        return vendor.getRateCard();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}/rates")
    public RateCardRequest updateItemList(@RequestBody RateCardRequest rateRequest, @PathVariable String id)
            throws LaundryException {
        LOGGER.info("update the rate of items of the vendor by Id:" + id);
        services.updateRateList(rateRequest, id);
        return rateRequest;

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}/address")
    public VendorAddressRequest updateVendorAddress(@RequestBody VendorAddressRequest addRequest,
            @PathVariable String id) throws LaundryException {
        LOGGER.info("update the address of the vendor by Id:" + id);
        services.updateAddress(addRequest, id);
        return addRequest;

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}/address")
    public VendorAddress getAddress(@PathVariable String id) throws LaundryException {
        LOGGER.info("get vendor address by vendor ID:" + id);
        Vendor vendor = services.getVendorAddress(id);
        return vendor.getAddress();
    }

}

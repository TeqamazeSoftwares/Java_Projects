package com.teqamaze.laundry.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.teqamaze.laundry.dao.VendorDao;
import com.teqamaze.laundry.dto.RateCardRequest;
import com.teqamaze.laundry.dto.Vendor;
import com.teqamaze.laundry.dto.VendorAddressRequest;
import com.teqamaze.laundry.dto.VendorServiceTypeRequest;
import com.teqamaze.laundry.error.LaundryError;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.VendorServices;

@Service
public class VendorServiceImpl implements VendorServices {

    private static final Logger LOGGER = LoggerFactory.getLogger(VendorServiceImpl.class);

    @Autowired
    private VendorDao vendorDao;

    // for deleting the user profile

    @Override
    public void deleteVendor(String id) throws LaundryException {

        LOGGER.info("Deleting user having Id : " + id);
        if (StringUtils.isBlank(id)) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_ID_INVALID);
        }
        vendorDao.delete(id);
    }

    // for inserting the new Vendor Profile

    @Override
    public Vendor save(Vendor vendor) {
        LOGGER.info("create the new vendors");
        vendorDao.save(vendor);
        return vendor;
    }

    // for updating the vendor Profile
    @Override
    public Vendor updateVendor(Vendor vendor, String id) throws LaundryException {
        LOGGER.info("update vendors having Id : " + id);
        vendorDao.save(vendor);
        return vendor;
    }

    // get all vendors profile
    @Override
    public List<Vendor> getVendors() throws LaundryException {
        List<Vendor> vendorList = new ArrayList<>();
        vendorDao.findAll().forEach(vendorList::add);
        if (vendorList.isEmpty() || vendorList == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_NOT_FOUND);
        }
        return vendorList;

    }

    // get vendor by id
    @Override
    public Vendor getVendor(String id) throws LaundryException {
        Vendor vendor = vendorDao.findOne(id);
        if (vendor == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_NOT_FOUND);
        }
        return vendor;
    }

    @Override
    public List<Vendor> sortVendorByCode(String pinCode, String vendorCode) throws LaundryException {

        List<Vendor> vendorByCode = new ArrayList<Vendor>();
        vendorByCode = vendorDao.findByCodeOrPinCode(vendorCode, pinCode);
        if (vendorByCode == null || vendorByCode.isEmpty()) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_NOT_FOUND);
        }
        
        return vendorByCode;
    }


    @Override
    public Vendor findVendor(String id) {
        LOGGER.info("find all services provided by vendors");
        Vendor vendor = vendorDao.findVendorById(id);
        return vendor;
    }

    @Override
    public Vendor updateServices(VendorServiceTypeRequest vendorServiceRequest, String id) throws LaundryException {
        LOGGER.info("update the vendor service with vendor Id : " + id);
        Vendor vendor = this.getVendor(id);
        vendor.setServices(vendorServiceRequest.getServices());
        vendorDao.save(vendor);
        return vendor;
    }

   /* @Override
    public void deleteServices(String id) {
        LOGGER.info("delete the vendor service with vendor Id : " + id);
        vendorDao.deleteServices(id);

    }
*/
    @Override
    public Vendor getItemsRate(String id) throws LaundryException {
        LOGGER.info("find all items rates by vendor");
        Vendor vendor = this.getVendor(id);
        if (vendor == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_ID_INVALID);
        }

        return vendor;
    }

    @Override
    public Vendor updateRateList(RateCardRequest rateRequest, String id) throws LaundryException {

        LOGGER.info("update the vendor Items rate with vendor Id : " + id);
        Vendor vendor = this.getVendor(id);
        vendor.setRateCard(rateRequest.getRateCard());
        vendorDao.save(vendor);
        return vendor;
    }

    @Override
    public Vendor updateAddress(VendorAddressRequest addRequest, String id) throws LaundryException {
        LOGGER.info("update the vendor address by vendor Id : " + id);
        Vendor vendor = this.getVendor(id);
        vendor.setAddress(addRequest.getAddress());
        vendorDao.save(vendor);
        return vendor;
    }

    @Override
    public Vendor getVendorAddress(String id) throws LaundryException {
        LOGGER.info("get the vendor address by vendor Id : " + id);
        Vendor vendor = vendorDao.findOne(id);
        if (vendor == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_VENDOR_ID_INVALID);
        }
        return vendor;
    }

}

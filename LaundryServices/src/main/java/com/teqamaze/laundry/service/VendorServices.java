package com.teqamaze.laundry.service;

import java.util.List;

import com.teqamaze.laundry.dto.RateCardRequest;
import com.teqamaze.laundry.dto.Vendor;
import com.teqamaze.laundry.dto.VendorAddressRequest;
import com.teqamaze.laundry.dto.VendorServiceTypeRequest;
import com.teqamaze.laundry.exception.LaundryException;

/**
 * Vendor service
 * 
 * @author Administrator
 *
 */
public interface VendorServices {
	
    //Vendor Profile methods--------->
    
    public Vendor save(Vendor vendor) throws LaundryException;
	

	public List<Vendor> getVendors() throws LaundryException;
	
	public void deleteVendor(String id) throws LaundryException;

	public Vendor updateVendor(Vendor vendor, String id) throws LaundryException;

	public Vendor getVendor(String id) throws LaundryException;
	
	public List<Vendor> sortVendorByCode(String pinCode, String vendorCode) throws LaundryException;
	
//	public Vendor findByCode(String vendorCode) throws LaundryException;
	
	// vendor services methods----->
	
	public Vendor findVendor(String id);
	
	public Vendor updateServices(VendorServiceTypeRequest vendorServiceRequest, String id) throws LaundryException;
	
	/*public void deleteServices(String id);*/
	
	// vendor items methods ------>
	/*public Vendor getItems(String id) throws LaundryException;
	
	public Vendor updateItems(ItemsRequest vendorItems, String id) throws LaundryException;
	*/
	
	public Vendor getItemsRate(String id) throws LaundryException;
	
	
	public Vendor updateRateList(RateCardRequest rateRequest, String id) throws LaundryException;
	
	public Vendor updateAddress(VendorAddressRequest addRequest, String id) throws LaundryException;
	
	public Vendor getVendorAddress(String id) throws LaundryException;

	
}

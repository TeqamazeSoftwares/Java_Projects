package com.teqamaze.laundry.dto;

import java.util.List;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.teqamaze.laundry.constant.VendorServicesType;

@Document (collection = "vendor")
@TypeAlias("vendor")
public class Vendor {


	@Id
	@Field ("vendorId")
	private String id;
	
	//@NotNull
	@Field ("vendorName")
	@Indexed
	private String vendorName;
	
	//@NotNull
	@Field ("phoneNo")
	@Indexed
	private String phoneNo;
	
	@Email
	@Field ("email")
	private String email;
	
	@Field ("image")
	private byte[] image;
	
	@Field ("vendorCode")
	private String vendorCode;
	
	@Field("mobileNo")
	private String mobileNo;
	
	@Field("address")
	private VendorAddress address;
	
	@Field("services")
	private List<VendorServicesType> services;
	
	@Field("isMobileverified")
    private boolean isMobileVerified = false;

	@Field("rateCard")
	private RateCard rateCard;

	public Vendor() {
		super();
	}
     

   /* public Vendor(String id, String vendorName, String phoneNo, String email, byte[] image, String vendorCode,
            String mobileNo, VendorAddress address, List<VendorServicesType> services, List<RateCardDTO> rateCard) {
        super();
        this.id = id;
        this.vendorName = vendorName;
        this.phoneNo = phoneNo;
        this.email = email;
        this.image = image;
        this.vendorCode = vendorCode;
        this.mobileNo = mobileNo;
        this.address = address;
        this.services = services;
        this.rateCard = rateCard;
    }
*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public VendorAddress getAddress() {
        return address;
    }

    public void setAddress(VendorAddress address) {
        this.address = address;
    }
    

    public List<VendorServicesType> getServices() {
        return services;
    }

    public void setServices(List<VendorServicesType> services) {
        this.services = services;
    }

    public RateCard getRateCard() {
        return rateCard;
    }

    public void setRateCard(RateCard rateCard) {
        this.rateCard = rateCard;
    }

    public boolean isMobileVerified() {
        return isMobileVerified;
    }

    public void setMobileVerified(boolean isMobileVerified) {
        this.isMobileVerified = isMobileVerified;
    }

   


   

 /*   @Override
    public String toString() {
        return "Vendor [id=" + id + ", vendorName=" + vendorName + ", phoneNo=" + phoneNo + ", email=" + email
                + ", image=" + Arrays.toString(image) + ", vendorCode=" + vendorCode + ", mobileNo=" + mobileNo
                + ", address=" + address + ", services=" + services + "]";
    }
    */

   
}

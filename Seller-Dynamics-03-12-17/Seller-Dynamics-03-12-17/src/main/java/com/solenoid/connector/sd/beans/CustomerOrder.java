/*
 * Copyright (C) 2017 Solenoid Augment Technologies Limited.
 * All rights reserved.
 */

// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.29 at 02:53:44 PM IST 
//

package com.solenoid.connector.sd.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for CustomerOrder complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShippingAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddressPostZIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAddressTown" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SKU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PricePaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostagePaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketPlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MarketPlaceOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EANBarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerMarketplaceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GoodsPurchasedID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="OrderStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SupplierID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="PurchaseID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordVersion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ShippingMethodRequested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostageMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerOrder", propOrder = { "shippingAddressCountry",
		"shippingAddress1", "shippingAddress2", "shippingAddress3",
		"shippingAddressPostZIPCode", "shippingAddressRegion",
		"shippingAddressTown", "status", "itemShipDate", "sku", "itemTitle",
		"quantity", "pricePaid", "postagePaid", "customerEmail",
		"customerName", "marketPlaceName", "isPaid", "marketPlaceOrderID",
		"eanBarCode", "customerMarketplaceIdentifier", "purchaseDate",
		"goodsPurchasedID", "orderStatusID", "supplierID", "purchaseID",
		"taxRate", "taxPaid", "shippingTaxPaid", "totalTaxPaid", "costPrice",
		"isError", "errorMessage", "recordVersion", "shippingMethodRequested",
		"postageMethodName", "purchaseOrderNumber", "customerPhone" })
public class CustomerOrder {

	@XmlElement(name = "ShippingAddressCountry")
	protected String shippingAddressCountry;
	@XmlElement(name = "ShippingAddress1")
	protected String shippingAddress1;
	@XmlElement(name = "ShippingAddress2")
	protected String shippingAddress2;
	@XmlElement(name = "ShippingAddress3")
	protected String shippingAddress3;
	@XmlElement(name = "ShippingAddressPostZIPCode")
	protected String shippingAddressPostZIPCode;
	@XmlElement(name = "ShippingAddressRegion")
	protected String shippingAddressRegion;
	@XmlElement(name = "ShippingAddressTown")
	protected String shippingAddressTown;
	@XmlElement(name = "Status")
	protected String status;
	@XmlElement(name = "ItemShipDate", required = true, nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar itemShipDate;
	@XmlElement(name = "SKU")
	protected String sku;
	@XmlElement(name = "ItemTitle")
	protected String itemTitle;
	@XmlElement(name = "Quantity")
	protected int quantity;
	@XmlElement(name = "PricePaid")
	protected String pricePaid;
	@XmlElement(name = "PostagePaid")
	protected String postagePaid;
	@XmlElement(name = "CustomerEmail")
	protected String customerEmail;
	@XmlElement(name = "CustomerName")
	protected String customerName;
	@XmlElement(name = "MarketPlaceName")
	protected String marketPlaceName;
	@XmlElement(name = "IsPaid")
	protected boolean isPaid;
	@XmlElement(name = "MarketPlaceOrderID")
	protected String marketPlaceOrderID;
	@XmlElement(name = "EANBarCode")
	protected String eanBarCode;
	@XmlElement(name = "CustomerMarketplaceIdentifier")
	protected String customerMarketplaceIdentifier;
	@XmlElement(name = "PurchaseDate", required = true, nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar purchaseDate;
	@XmlElement(name = "GoodsPurchasedID", required = true)
	protected String goodsPurchasedID;
	@XmlElement(name = "OrderStatusID")
	protected int orderStatusID;
	@XmlElement(name = "SupplierID", required = true, nillable = true)
	protected String supplierID;
	@XmlElement(name = "PurchaseID", required = true)
	protected String purchaseID;
	@XmlElement(name = "TaxRate")
	protected String taxRate;
	@XmlElement(name = "TaxPaid")
	protected String taxPaid;
	@XmlElement(name = "ShippingTaxPaid")
	protected String shippingTaxPaid;
	@XmlElement(name = "TotalTaxPaid")
	protected String totalTaxPaid;
	@XmlElement(name = "CostPrice")
	protected String costPrice;
	@XmlElement(name = "IsError")
	protected boolean isError;
	@XmlElement(name = "ErrorMessage")
	protected String errorMessage;
	@XmlElement(name = "RecordVersion")
	protected byte[] recordVersion;
	@XmlElement(name = "ShippingMethodRequested")
	protected String shippingMethodRequested;
	@XmlElement(name = "PostageMethodName")
	protected String postageMethodName;
	@XmlElement(name = "PurchaseOrderNumber")
	protected String purchaseOrderNumber;
	@XmlElement(name = "CustomerPhone")
	protected String customerPhone;

	/**
	 * Gets the value of the shippingAddressCountry property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddressCountry() {
		return shippingAddressCountry;
	}

	/**
	 * Sets the value of the shippingAddressCountry property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddressCountry(String value) {
		this.shippingAddressCountry = value;
	}

	/**
	 * Gets the value of the shippingAddress1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddress1() {
		return shippingAddress1;
	}

	/**
	 * Sets the value of the shippingAddress1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddress1(String value) {
		this.shippingAddress1 = value;
	}

	/**
	 * Gets the value of the shippingAddress2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddress2() {
		return shippingAddress2;
	}

	/**
	 * Sets the value of the shippingAddress2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddress2(String value) {
		this.shippingAddress2 = value;
	}

	/**
	 * Gets the value of the shippingAddress3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddress3() {
		return shippingAddress3;
	}

	/**
	 * Sets the value of the shippingAddress3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddress3(String value) {
		this.shippingAddress3 = value;
	}

	/**
	 * Gets the value of the shippingAddressPostZIPCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddressPostZIPCode() {
		return shippingAddressPostZIPCode;
	}

	/**
	 * Sets the value of the shippingAddressPostZIPCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddressPostZIPCode(String value) {
		this.shippingAddressPostZIPCode = value;
	}

	/**
	 * Gets the value of the shippingAddressRegion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddressRegion() {
		return shippingAddressRegion;
	}

	/**
	 * Sets the value of the shippingAddressRegion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddressRegion(String value) {
		this.shippingAddressRegion = value;
	}

	/**
	 * Gets the value of the shippingAddressTown property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingAddressTown() {
		return shippingAddressTown;
	}

	/**
	 * Sets the value of the shippingAddressTown property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingAddressTown(String value) {
		this.shippingAddressTown = value;
	}

	/**
	 * Gets the value of the status property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the value of the status property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setStatus(String value) {
		this.status = value;
	}

	/**
	 * Gets the value of the itemShipDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getItemShipDate() {
		return itemShipDate;
	}

	/**
	 * Sets the value of the itemShipDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setItemShipDate(XMLGregorianCalendar value) {
		this.itemShipDate = value;
	}

	/**
	 * Gets the value of the sku property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSKU() {
		return sku;
	}

	/**
	 * Sets the value of the sku property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSKU(String value) {
		this.sku = value;
	}

	/**
	 * Gets the value of the itemTitle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getItemTitle() {
		return itemTitle;
	}

	/**
	 * Sets the value of the itemTitle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setItemTitle(String value) {
		this.itemTitle = value;
	}

	/**
	 * Gets the value of the quantity property.
	 * 
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * Sets the value of the quantity property.
	 * 
	 */
	public void setQuantity(int value) {
		this.quantity = value;
	}

	/**
	 * Gets the value of the pricePaid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPricePaid() {
		return pricePaid;
	}

	/**
	 * Sets the value of the pricePaid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPricePaid(String value) {
		this.pricePaid = value;
	}

	/**
	 * Gets the value of the postagePaid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostagePaid() {
		return postagePaid;
	}

	/**
	 * Sets the value of the postagePaid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPostagePaid(String value) {
		this.postagePaid = value;
	}

	/**
	 * Gets the value of the customerEmail property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerEmail() {
		return customerEmail;
	}

	/**
	 * Sets the value of the customerEmail property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerEmail(String value) {
		this.customerEmail = value;
	}

	/**
	 * Gets the value of the customerName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Sets the value of the customerName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerName(String value) {
		this.customerName = value;
	}

	/**
	 * Gets the value of the marketPlaceName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarketPlaceName() {
		return marketPlaceName;
	}

	/**
	 * Sets the value of the marketPlaceName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarketPlaceName(String value) {
		this.marketPlaceName = value;
	}

	/**
	 * Gets the value of the isPaid property.
	 * 
	 */
	public boolean isIsPaid() {
		return isPaid;
	}

	/**
	 * Sets the value of the isPaid property.
	 * 
	 */
	public void setIsPaid(boolean value) {
		this.isPaid = value;
	}

	/**
	 * Gets the value of the marketPlaceOrderID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarketPlaceOrderID() {
		return marketPlaceOrderID;
	}

	/**
	 * Sets the value of the marketPlaceOrderID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarketPlaceOrderID(String value) {
		this.marketPlaceOrderID = value;
	}

	/**
	 * Gets the value of the eanBarCode property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEANBarCode() {
		return eanBarCode;
	}

	/**
	 * Sets the value of the eanBarCode property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEANBarCode(String value) {
		this.eanBarCode = value;
	}

	/**
	 * Gets the value of the customerMarketplaceIdentifier property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerMarketplaceIdentifier() {
		return customerMarketplaceIdentifier;
	}

	/**
	 * Sets the value of the customerMarketplaceIdentifier property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerMarketplaceIdentifier(String value) {
		this.customerMarketplaceIdentifier = value;
	}

	/**
	 * Gets the value of the purchaseDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getPurchaseDate() {
		return purchaseDate;
	}

	/**
	 * Sets the value of the purchaseDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setPurchaseDate(XMLGregorianCalendar value) {
		this.purchaseDate = value;
	}

	/**
	 * Gets the value of the goodsPurchasedID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getGoodsPurchasedID() {
		return goodsPurchasedID;
	}

	/**
	 * Sets the value of the goodsPurchasedID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setGoodsPurchasedID(String value) {
		this.goodsPurchasedID = value;
	}

	/**
	 * Gets the value of the orderStatusID property.
	 * 
	 */
	public int getOrderStatusID() {
		return orderStatusID;
	}

	/**
	 * Sets the value of the orderStatusID property.
	 * 
	 */
	public void setOrderStatusID(int value) {
		this.orderStatusID = value;
	}

	/**
	 * Gets the value of the supplierID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSupplierID() {
		return supplierID;
	}

	/**
	 * Sets the value of the supplierID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSupplierID(String value) {
		this.supplierID = value;
	}

	/**
	 * Gets the value of the purchaseID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPurchaseID() {
		return purchaseID;
	}

	/**
	 * Sets the value of the purchaseID property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPurchaseID(String value) {
		this.purchaseID = value;
	}

	/**
	 * Gets the value of the isError property.
	 * 
	 */
	public boolean isIsError() {
		return isError;
	}

	/**
	 * Sets the value of the isError property.
	 * 
	 */
	public void setIsError(boolean value) {
		this.isError = value;
	}

	/**
	 * Gets the value of the errorMessage property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the value of the errorMessage property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setErrorMessage(String value) {
		this.errorMessage = value;
	}

	/**
	 * Gets the value of the recordVersion property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getRecordVersion() {
		return recordVersion;
	}

	/**
	 * Sets the value of the recordVersion property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setRecordVersion(byte[] value) {
		this.recordVersion = value;
	}

	/**
	 * Gets the value of the shippingMethodRequested property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getShippingMethodRequested() {
		return shippingMethodRequested;
	}

	/**
	 * Sets the value of the shippingMethodRequested property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setShippingMethodRequested(String value) {
		this.shippingMethodRequested = value;
	}

	/**
	 * Gets the value of the postageMethodName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPostageMethodName() {
		return postageMethodName;
	}

	/**
	 * Sets the value of the postageMethodName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPostageMethodName(String value) {
		this.postageMethodName = value;
	}

	/**
	 * Gets the value of the purchaseOrderNumber property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	/**
	 * Sets the value of the purchaseOrderNumber property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPurchaseOrderNumber(String value) {
		this.purchaseOrderNumber = value;
	}

	/**
	 * Gets the value of the customerPhone property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCustomerPhone() {
		return customerPhone;
	}

	/**
	 * Sets the value of the customerPhone property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCustomerPhone(String value) {
		this.customerPhone = value;
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public String getTaxPaid() {
		return taxPaid;
	}

	public void setTaxPaid(String taxPaid) {
		this.taxPaid = taxPaid;
	}

	public String getShippingTaxPaid() {
		return shippingTaxPaid;
	}

	public void setShippingTaxPaid(String shippingTaxPaid) {
		this.shippingTaxPaid = shippingTaxPaid;
	}

	public String getTotalTaxPaid() {
		return totalTaxPaid;
	}

	public void setTotalTaxPaid(String totalTaxPaid) {
		this.totalTaxPaid = totalTaxPaid;
	}

	public String getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(String costPrice) {
		this.costPrice = costPrice;
	}
	
}

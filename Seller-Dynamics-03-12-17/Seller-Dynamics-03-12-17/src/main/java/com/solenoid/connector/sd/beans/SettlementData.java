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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SettlementData complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SettlementData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pagination" type="{https://my.sellerdynamics.com/}PaginationObject" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{https://my.sellerdynamics.com/}ArrayOfSettlementDataItem" minOccurs="0"/&gt;
 *         &lt;element name="IsError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementData", propOrder = { "pagination", "data",
		"isError", "errorMessage" })
public class SettlementData {

	@XmlElement(name = "Pagination")
	protected PaginationObject pagination;
	@XmlElement(name = "Data")
	protected ArrayOfSettlementDataItem data;
	@XmlElement(name = "IsError")
	protected boolean isError;
	@XmlElement(name = "ErrorMessage")
	protected String errorMessage;

	/**
	 * Gets the value of the pagination property.
	 * 
	 * @return possible object is {@link PaginationObject }
	 * 
	 */
	public PaginationObject getPagination() {
		return pagination;
	}

	/**
	 * Sets the value of the pagination property.
	 * 
	 * @param value
	 *            allowed object is {@link PaginationObject }
	 * 
	 */
	public void setPagination(PaginationObject value) {
		this.pagination = value;
	}

	/**
	 * Gets the value of the data property.
	 * 
	 * @return possible object is {@link ArrayOfSettlementDataItem }
	 * 
	 */
	public ArrayOfSettlementDataItem getData() {
		return data;
	}

	/**
	 * Sets the value of the data property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfSettlementDataItem }
	 * 
	 */
	public void setData(ArrayOfSettlementDataItem value) {
		this.data = value;
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

}
//
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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfOrderUpdateItemWithTracking complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderUpdateItemWithTracking"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderUpdateItemWithTracking" type="{https://my.sellerdynamics.com/}OrderUpdateItemWithTracking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderUpdateItemWithTracking", propOrder = { "orderUpdateItemWithTracking" })
public class ArrayOfOrderUpdateItemWithTracking {

	@XmlElement(name = "OrderUpdateItemWithTracking", nillable = true)
	protected List<OrderUpdateItemWithTracking> orderUpdateItemWithTracking;

	/**
	 * Gets the value of the orderUpdateItemWithTracking property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the orderUpdateItemWithTracking property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getOrderUpdateItemWithTracking().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link OrderUpdateItemWithTracking }
	 * 
	 * 
	 */
	public List<OrderUpdateItemWithTracking> getOrderUpdateItemWithTracking() {
		if (orderUpdateItemWithTracking == null) {
			orderUpdateItemWithTracking = new ArrayList<OrderUpdateItemWithTracking>();
		}
		return this.orderUpdateItemWithTracking;
	}

}

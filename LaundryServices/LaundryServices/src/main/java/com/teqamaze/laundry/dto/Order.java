package com.teqamaze.laundry.dto;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.teqamaze.laundry.constant.OrderStatus;

//import io.swagger.annotations.ApiModelProperty;

@Document(collection = "order")
public class Order {

    private String id; 
    @Field("pickUpDate")
    private Date pickUpDate;
    
    @Field("deliveryDate")
    private Date deliveryDate;
    
    @Field("promoCode")
    private String promoCode;
    
    @Field("orderTo")
    private String orderTo;
    
    @Field("orderBy")
    private String orderBy;
    
    @Field("status")
    private OrderStatus status;
    
    @Field("vendorId")
    private String vendorId;
    
    @Field("userId")
    private String userId;
    
    @Field("cart")
    private Cart cart;

    public Order() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getOrderTo() {
        return orderTo;
    }

    public void setOrderTo(String orderTo) {
        this.orderTo = orderTo;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
    
    public OrderStatus getStatus() {
        return status;
    }

    
    public void setStatus(OrderStatus status) {
        
        this.status = status;
    }
    

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    

   /* @Override
    public String toString() {
        return "Order [id=" + id + ", pickUpDate=" + pickUpDate + ", deliveryDate=" + deliveryDate + ", promoCode="
                + promoCode + ", orderTo=" + orderTo + ", orderBy=" + orderBy + ", status=" + status + ", getId()="
                + getId() + ", getPickUpDate()=" + getPickUpDate() + ", getDeliveryDate()=" + getDeliveryDate()
                + ", getPromoCode()=" + getPromoCode() + ", getOrderTo()=" + getOrderTo() + ", getOrderBy()="
                + getOrderBy() + ", getStatus()=" + getStatus() + ", getVendorId()=" + getVendorId() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    } */

    

   
}

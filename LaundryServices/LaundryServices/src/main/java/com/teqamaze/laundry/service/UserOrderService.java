package com.teqamaze.laundry.service;

import java.util.List;

import com.teqamaze.laundry.dto.Order;
import com.teqamaze.laundry.exception.LaundryException;

public interface UserOrderService {

    public Order createOrder(Order order);

    public Order getOrder(String id) throws LaundryException;

    public List<Order> getAllOrder() throws LaundryException;

    public Order updateOrder(Order order, String id) throws LaundryException;

    public void deleteOrder(String id) throws LaundryException;

    public List<Order> getOrderByUserId(String userId) throws LaundryException;

    /*
     * public Order savePickUp(Order order); public Order saveDelivery(Order order);
     * public Order savePromo(Order order); public Order saverOrderTo(Order order);
     * public Order saveOrderBy(Order order);
     * 
     * public Order updatePickUp(Order order , String id); public Order
     * updateDelivery(Order order, String id);
     * 
     * public void deleteOrderTo(String id);
     * 
     */

}

package com.teqamaze.laundry.service;

import java.util.List;

import com.teqamaze.laundry.dto.Order;
import com.teqamaze.laundry.exception.LaundryException;

public interface VendorOrderService {

    public List<Order> getAllOrder() throws LaundryException;

    public Order updateOrder(Order order, String id) throws LaundryException;

    public Order updateStatus(Order order, String status) throws LaundryException;

    public List<Order> getOrderByVendorId(String vendorId) throws LaundryException;

}

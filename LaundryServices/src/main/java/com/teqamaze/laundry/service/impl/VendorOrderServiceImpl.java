package com.teqamaze.laundry.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teqamaze.laundry.constant.OrderStatus;
import com.teqamaze.laundry.dao.OrderDao;
import com.teqamaze.laundry.dto.Order;
import com.teqamaze.laundry.error.LaundryError;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.VendorOrderService;

@Service
public class VendorOrderServiceImpl implements VendorOrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(VendorOrderServiceImpl.class);

    @Autowired
    OrderDao orderDao;

    @Override
    public List<Order> getAllOrder() throws LaundryException {

        List<Order> list = new ArrayList<>();
        LOGGER.info("getting the all user order details : ");
        list = (List<Order>) orderDao.findAll();
        if(list.isEmpty() || list == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_ORDER_NOT_FOUND);
        }
        return list;
    }

    @Override
    public List<Order> getOrderByVendorId(String vendorId) throws LaundryException {
        List<Order> list = new ArrayList<>();
        LOGGER.info("getting the all vendor order details : ");
        list = orderDao.findOrderByVendorId(vendorId);
        if(list.isEmpty() || list == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_NO_ORDER_FOR_THIS_VENDOR_ID); 
        }
        return list;
    }

    @Override
    public Order updateOrder(Order order, String id) throws LaundryException {
        LOGGER.info("update the order : ");
        Order updatedOrder = orderDao.save(order);
        if(updatedOrder == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_UPDATE_ORDER_FAILED); 
        }
        return updatedOrder;
    }

    @Override
    public Order updateStatus(Order order, String status) throws LaundryException {
        //TODO: it should be come from vendor respond
//        order.setStatus(OrderStatus.ACCEPTED);
//        String vendorAcceptance = "ACCEPTED";
        
        if(status.equals("ACCEPTED")) {
            order.setStatus(OrderStatus.ACCEPTED);
        }else if(status.equals("REJECTED")) {
            order.setStatus(OrderStatus.REJECTED);
        }
        Order updatedOrder = orderDao.save(order);
        
        //TODO: notification code to user
        
        if(updatedOrder == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_UPDATE_ORDER_FAILED); 
        }
        return updatedOrder;
    }

}

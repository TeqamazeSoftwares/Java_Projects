package com.teqamaze.laundry.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teqamaze.laundry.constant.OrderStatus;
import com.teqamaze.laundry.dao.OrderDao;
import com.teqamaze.laundry.dto.Order;
import com.teqamaze.laundry.error.LaundryError;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.UserOrderService;

@Service
public class UserOrderServiceImpl implements UserOrderService {

    @Autowired
    OrderDao orderDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderServiceImpl.class);

    // for placing the user order
    @Override
    public Order createOrder(Order order) {
        LOGGER.info("placing  the user order : ");
        order.setStatus(OrderStatus.PENDING);
        orderDao.save(order);
        return order;
    }

    // for get the user order detail
    @Override
    public Order getOrder(String id) throws LaundryException {
        LOGGER.info("getting the user order detail : ");
        Order order = orderDao.findOne(id);
        if(order==null)
        {
             throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_ORDER_NOT_FOUND);
        }
        return order;

    } 

    // FOR GETTING THE LIST OF USER ORDER DETAILS

    @Override
    public List<Order> getAllOrder() throws LaundryException {
        List<Order> list = new ArrayList<>();
        LOGGER.info("getting the all user order details : ");
        list = (List<Order>) orderDao.findAll();
        if(list.isEmpty() || list == null)
        {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_ORDER_NOT_FOUND);
        }
        return list;

    }

    @Override
    public Order updateOrder(Order order, String id) throws LaundryException {
        LOGGER.info("updating the user order details: ");
        Order updatedOrder = orderDao.save(order);
        if(updatedOrder == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_UPDATE_ORDER_FAILED);
        }
        return updatedOrder;
    }

    @Override
    public void deleteOrder(String id) throws LaundryException {
        LOGGER.info("deleting the order details : ");
        if(StringUtils.isBlank(id)) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_ORDER_ID_INVALID); 
        }
        orderDao.delete(id);
    }

    @Override
    public List<Order> getOrderByUserId(String userId) throws LaundryException {
        List<Order> list = new ArrayList<>();
        LOGGER.info("getting the all user order details : ");
        list = orderDao.findOrderByUserId(userId);
        if(list.isEmpty() || list == null) {
            throw new LaundryException(LaundryError.TSL_ERROR_LAUNDRY_NO_ORDER_FOR_THIS_USER_ID);  
        }
        return list;
    }

    
}

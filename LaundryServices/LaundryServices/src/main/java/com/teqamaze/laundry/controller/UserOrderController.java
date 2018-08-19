package com.teqamaze.laundry.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.teqamaze.laundry.dto.Order;
import com.teqamaze.laundry.exception.LaundryException;
import com.teqamaze.laundry.service.UserOrderService;

@RestController
@RequestMapping("/user/order")
public class UserOrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderController.class);

    @Autowired
    UserOrderService userOrder;

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> getAllOrders() throws LaundryException {
        LOGGER.info("Getting all user's order: ");
        List<Order> order = userOrder.getAllOrder();
        return order;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Order getOrderByOrdrId(@PathVariable String id) throws LaundryException {
        LOGGER.info("Get order by order ID: ");
        return userOrder.getOrder(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void placeOrder(@RequestBody Order order) {
        // order.setStatus(Order.OrderStatus.PENDING);
        LOGGER.info("placing the user order: ");
        userOrder.createOrder(order);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateOrderByOrderId(@RequestBody Order order, @PathVariable String id) throws LaundryException {
        LOGGER.info("updating the user order: ");
        order.setId(id);
        if(!id.isEmpty()) {
        userOrder.updateOrder(order, id);
        }

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteOrder(@PathVariable String id) throws LaundryException {
        LOGGER.info("deleting the user order: ");
        userOrder.deleteOrder(id);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/user/{userId}")
    public List<Order> getOrdersByUserId(@PathVariable String userId) throws LaundryException {
        LOGGER.info("Getting all order by userId: ");
        List<Order> order = userOrder.getOrderByUserId(userId);
        return order;
    }
    
    
}

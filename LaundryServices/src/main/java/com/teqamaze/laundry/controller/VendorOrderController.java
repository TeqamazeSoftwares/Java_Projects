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
import com.teqamaze.laundry.service.VendorOrderService;

@RestController
@RequestMapping("/vendor/order")
public class VendorOrderController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserOrderController.class);

    @Autowired
    VendorOrderService vendorOrder;

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> getOrders() throws LaundryException {
        LOGGER.info("Getting all user's order");
        List<Order> order = vendorOrder.getAllOrder();
        return order;

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public void updateOrderByVendor(@RequestBody Order order, @PathVariable String id) throws LaundryException {
        order.setId(id);
        LOGGER.info("updating the order");
        if(!id.isEmpty()) {
            vendorOrder.updateOrder(order, id);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/status/{id}")
    public void updateOrderStatus(@RequestBody Order order, @PathVariable String id) throws LaundryException {
        LOGGER.info("updating the order status");
        String status = "REJECTED";
        order.setId(id);
        vendorOrder.updateStatus(order,status);

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public List<Order> getOrderByVendor(@PathVariable String id) throws LaundryException {
        LOGGER.info("Getting all order by VendorId");
        List<Order> order = vendorOrder.getOrderByVendorId(id);
        return order;
    }

}

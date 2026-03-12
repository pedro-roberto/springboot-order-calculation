package com.desafio1.demo.services;

import com.desafio1.demo.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public Double total(Order order) {
        double discount = order.getDiscount();
        double basic = order.getBasic();

        return basic * (1 - (discount/100)) + shippingService.shipment(order);
    }
}

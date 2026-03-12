package com.desafio1.demo.services;

import com.desafio1.demo.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        double basic = order.getBasic();

        if (basic < 100.00)
            return 20.00;
        else if (basic >= 100.00 && basic <200.00) {
            return 12.00;
        }else
            return 0.0;
    }
}

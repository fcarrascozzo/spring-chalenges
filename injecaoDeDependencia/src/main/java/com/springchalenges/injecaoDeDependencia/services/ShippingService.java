package com.springchalenges.injecaoDeDependencia.services;

import com.springchalenges.injecaoDeDependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double total(Order order) {
        Double basicValue = order.getBasic();

        if(basicValue < 100.0) {
            return 20.0;
        } else if(basicValue < 200.0) {
            return 12.0;
        }

        return 0.0;
    }
}
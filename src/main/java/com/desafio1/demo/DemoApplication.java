package com.desafio1.demo;

import com.desafio1.demo.entities.Order;
import com.desafio1.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;
	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309, 95.90, 0.0);

        System.out.printf("Pedido código: %d%nValor total: R$ %.2f%n", order.getCode(), orderService.total(order));
    }

}

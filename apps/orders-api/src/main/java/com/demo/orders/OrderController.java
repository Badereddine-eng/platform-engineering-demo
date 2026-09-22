package com.demo.orders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
                "application", "orders-api",
                "message", "Welcome to the Platform Engineering Demo"
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP"
        );
    }

    @GetMapping("/orders")
    public List<Order> orders() {
        return List.of(
                new Order(1L, "Laptop", 1),
                new Order(2L, "Keyboard", 2),
                new Order(3L, "Monitor", 1)
        );
    }
}
package com.demo.orders;

public record Order(
        Long id,
        String product,
        Integer quantity
) {
}
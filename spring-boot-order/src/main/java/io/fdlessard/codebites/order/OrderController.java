package io.fdlessard.codebites.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders/{id}")
    public Order getOrder(@PathVariable long id) {

        List<OrderItem> orderItems = Arrays.asList(
                OrderItem.builder()
                        .productName("product name 1")
                        .quantity(2)
                        .build(),
                OrderItem.builder()
                        .productName("product name 2")
                        .quantity(3)
                        .build()
        );

        return Order.builder()
                .id(id)
                .date(new Date().toString())
                .orderItems(orderItems)
                .build();
    }
}

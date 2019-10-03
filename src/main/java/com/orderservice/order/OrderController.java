package com.orderservice.order;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {


    @Autowired
    OrderService orderService;

    @PostMapping
    public void postOrder(@RequestBody OrderDomain order) {
        System.out.println("In Post");
        orderService.orderList(order);

    }

    @GetMapping("/{id}")
    public OrderDomain somethingToGet(@PathVariable int id) {
        {
            System.out.println("In Get");
            return orderService.getOrderDomain(id);
        }
    }
}

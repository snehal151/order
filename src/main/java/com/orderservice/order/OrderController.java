package com.orderservice.order;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping
    public void postOrder(){
        System.out.println("In Post");
    }
    @GetMapping
    public String getOrder(){
        System.out.println("In Get");
        return "Welcome";
    }
}

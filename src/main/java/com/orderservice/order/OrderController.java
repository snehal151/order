package com.orderservice.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {


    @Autowired
    OrderService orderService;

    @PostMapping
    public ResponseEntity postOrder(@RequestBody OrderDomain order) {
        System.out.println("In Post");
        //orderService.orderList(order);
        OrderDomain SaveOrder = orderService.orderList(order);
        if (SaveOrder == null) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity(HttpStatus.CREATED);
        }


    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDomain> somethingToGet(@PathVariable int id) {
        System.out.println("In Get");

        OrderDomain tOrders = orderService.getOrderDomain(id);
        if (tOrders == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(tOrders, HttpStatus.OK);

        }
    }

    @GetMapping("")
    public ResponseEntity<List<OrderDomain>> getAll() {
        System.out.println("In Get");
        List<OrderDomain> allOrders = orderService.getAllOrders();
        return new ResponseEntity<>(allOrders, HttpStatus.OK);
    }

}
package com.orderservice.order;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {


    @Autowired
    OrderService orderService;

    @PostMapping
    public void postOrder(@RequestBody OrderDomain order)

        {
            System.out.println("In Post");
            orderService.orderList(order);

        }
        @GetMapping
        public String getOrder ()
    public OrderDomain somethingToGet(@PathVariable int id) {

        {
            System.out.println("In Get");

            return orderService.getOrder(id);

        }
    }

/*
////
public void postCompany(@RequestBody Company company) {
    logger.info("postCompany: start");
    companyService.orderList(order);
    logger.info("postCompany: finish");
}

    @GetMapping("/{id}")
    public Company somethingToGet(@PathVariable int id) {
        logger.info("getCompany: start");
        return companyService.getCompany(id);
    }

}
*/
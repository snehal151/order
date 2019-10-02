package com.orderservice.order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class OrderService {

    List<OrderDomain> orderlist = new ArrayList<>();

   public void orderList(OrderDomain order) {
       int nId =orderlist.size()+1;
       order.setId(nId);
        orderlist.add(order);
   }

   public OrderDomain getOrder(int id){
       Iterator<OrderDomain> iterator = orderlist.iterator();
       while (iterator.hasNext()) {
           OrderDomain tOrder = iterator.next();
           if (id == tOrder.getId()) {
               return tOrder;
           }
       }
       throw new RuntimeException("Company with id " + id + " Not found");
   }

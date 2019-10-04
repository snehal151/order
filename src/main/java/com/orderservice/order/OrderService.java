package com.orderservice.order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class OrderService {

    List<OrderDomain> orderlist = new ArrayList<>();

    public OrderDomain orderList(OrderDomain order) {
        int nId = orderlist.size() + 1;
        order.setId(nId);
        orderlist.add(order);
        return order;
    }

    public OrderDomain getOrderDomain(int id) {
        Iterator<OrderDomain> iterator = orderlist.iterator();
        while (iterator.hasNext()) {
            OrderDomain tOrder = iterator.next();
            if (id == tOrder.getId()) {
                return tOrder;
            }
        }
        return null;
    }
    public List<OrderDomain> getAllOrders() {
       return orderlist;
    }
}
package com.orderservice.order;

public class OrderDomain {
    int id;
    String name;
    String orderNo;
    String delivery;
    //setter
    public void setId(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setorderNo(String orderNo)
    {
        this.orderNo=orderNo;
    }
    public void setDelivery(String delivery)
    {
        this.delivery = delivery;
    }
//getters
    public String getName()
    {
        return name;
    }
    public String getOrderNo()

    {
        return orderNo;
    }
    public String getdelivery()

    {
        return delivery;
    }

    public int getId() {
        return id;
    }
}

package com.orderservice.order;

public class OrderDomain {
    String name;
    String orderNo;
    String delivery;
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setorderNo(String orderNo){
        this.orderNo=orderNo;
    }
   // public void getOrderNo(String orderNo){
    //    this.orderNo = orderNo;
  //  }
    public void getdelivery(String delivery){
        this.delivery = delivery;
    }
    public String getName(){
        return name;
    }
    public String getOrderNo(){
        return orderNo;
    }
    public String getdelivery(){
        return delivery;
    }
}

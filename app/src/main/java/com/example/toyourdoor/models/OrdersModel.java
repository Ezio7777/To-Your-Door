package com.example.toyourdoor.models;

public class OrdersModel {

    int orderImaage;
    String soldItemName,orderNo,price;

    public int getOrderImaage() {
        return orderImaage;
    }

    public void setOrderImaage(int orderImaage) {
        this.orderImaage = orderImaage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public OrdersModel(int orderImaage, String soldItemName, String orderNo, String price) {
        this.orderImaage = orderImaage;
        this.soldItemName = soldItemName;
        this.orderNo = orderNo;
        this.price = price;
    }
}

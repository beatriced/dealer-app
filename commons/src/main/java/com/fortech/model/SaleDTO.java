package com.fortech.model;

import java.util.Date;

public class SaleDTO {

    private int ID;
    private String paymentType;
    private Date orderDate;
    private int dealerID;
    private int customerID;
    private int carID;

    public SaleDTO(int ID, String paymentType, Date orderDate,
                   int dealerID, int customerID, int carID) {
        this.ID = ID;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.dealerID = dealerID;
        this.customerID = customerID;
        this.carID = carID;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDealerID() {
        return dealerID;
    }

    public void setDealerID(int dealerID) {
        this.dealerID = dealerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    @Override
    public String toString() {
        return "SaleDTO{" +
                "ID=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", dealerDTO=" + dealerID +
                ", customerDTO=" + customerID +
                ", carDTO=" + carID +
                '}';
    }
}

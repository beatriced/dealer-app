package com.fortech.model;

import com.fortech.entity.SaleEntity;

import java.util.Date;

public class SaleDTO {

    private int ID;
    private String paymentType;
    private Date orderDate;
    private int carID;
    private int dealerID;
    private int customerId;

    public SaleDTO(SaleEntity saleEntity){
        this.ID=saleEntity.getID();
        this.paymentType=saleEntity.getPaymentType();
        this.orderDate=saleEntity.getOrderDate();
        this.carID=saleEntity.getCarID();
        this.dealerID=saleEntity.getDealerID();
        this.customerId=saleEntity.getCustomerID();
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

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getDealerID() {
        return dealerID;
    }

    public void setDealerID(int dealerID) {
        this.dealerID = dealerID;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

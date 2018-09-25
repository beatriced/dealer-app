package com.fortech.model;

import java.io.Serializable;
import java.util.Date;

public class SaleDTO implements Serializable {

    private int ID;
    private String paymentType;
    private Date orderDate;

    public SaleDTO(int ID, String paymentType, Date orderDate) {
        this.ID = ID;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
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


    @Override
    public String toString() {
        return "SaleDTO{" +
                "ID=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }
}

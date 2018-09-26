package com.fortech.model;

import java.io.Serializable;
import java.util.Date;

public class SaleDTO implements Serializable {

    private int ID;
    private String paymentType;
    private Date orderDate;
    private String status;

    public SaleDTO(int ID, String paymentType, Date orderDate, String status) {
        this.ID = ID;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SaleDTO{" +
                "ID=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                '}';
    }
}

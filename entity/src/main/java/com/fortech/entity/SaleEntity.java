package com.fortech.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales")
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "paymentType")
    private String paymentType;

    @Column(name = "orderDate")
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "dealerID", referencedColumnName = "ID")
    private int dealerID;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "ID")
    private int customerID;

    @ManyToOne
    @JoinColumn(name = "carID", referencedColumnName = "ID")
    private int carID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public SaleEntity(String paymentType, Date orderDate,
                      int dealerID, int customerID, int carID) {
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.dealerID = dealerID;
        this.customerID = customerID;
        this.carID = carID;
    }

    public SaleEntity() {
    }

    @Override
    public String toString() {
        return "SaleEntity{" +
                "saleId=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", dealerEntity=" + dealerID +
                ", customerEntity=" + customerID +
                ", carEntity=" + carID +
                '}';
    }
}

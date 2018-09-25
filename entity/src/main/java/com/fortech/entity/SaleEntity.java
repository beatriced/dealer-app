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
    private DealerEntity dealerEntity;

    @ManyToOne
    @JoinColumn(name = "customerID", referencedColumnName = "ID")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "carID", referencedColumnName = "ID")
    private CarEntity carEntity;

    public SaleEntity(String paymentType, Date orderDate, DealerEntity dealerEntity,
                      CustomerEntity customerEntity, CarEntity carEntity) {
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.dealerEntity = dealerEntity;
        this.customerEntity = customerEntity;
        this.carEntity = carEntity;
    }

    public SaleEntity() {
    }

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

    public DealerEntity getDealerEntity() {
        return dealerEntity;
    }

    public void setDealerEntity(DealerEntity dealerEntity) {
        this.dealerEntity = dealerEntity;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public CarEntity getCarEntity() {
        return carEntity;
    }

    public void setCarEntity(CarEntity carEntity) {
        this.carEntity = carEntity;
    }

    @Override
    public String toString() {
        return "SaleEntity{" +
                "ID=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", dealerEntity=" + dealerEntity +
                ", customerEntity=" + customerEntity +
                ", carEntity=" + carEntity +
                '}';
    }
}

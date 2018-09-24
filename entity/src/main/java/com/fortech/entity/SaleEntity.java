package com.fortech.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales")
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int saleID;

    @Column(name = "dealerID")
    private int dealerId;

    @Column(name = "carID")
    private int carId;

    @Column(name = "CustomerID")
    private int customerId;

    @Column(name = "paymentType")
    private String paymentType;

    @Column(name = "orderDate")
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "dealerID")
    private DealerEntity dealerEntity;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "carID")
    private CarEntity carEntity;

    public SaleEntity(int dealerId, int carId, int customerId, String paymentType, Date orderDate,
                      DealerEntity dealerEntity, CustomerEntity customerEntity, CarEntity carEntity) {
        this.dealerId = dealerId;
        this.carId = carId;
        this.customerId = customerId;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.dealerEntity = dealerEntity;
        this.customerEntity = customerEntity;
        this.carEntity = carEntity;
    }

    @Override
    public String toString() {
        return "SaleEntity{" +
                "saleId=" + saleID +
                ", dealerId=" + dealerId +
                ", carId=" + carId +
                ", customerId=" + customerId +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", dealerEntity=" + dealerEntity +
                ", customerEntity=" + customerEntity +
                ", carEntity=" + carEntity +
                '}';
    }
}

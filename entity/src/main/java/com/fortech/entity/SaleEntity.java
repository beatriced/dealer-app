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

    public SaleEntity(String paymentType, Date orderDate,
                      DealerEntity dealerEntity, CustomerEntity customerEntity, CarEntity carEntity) {
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.dealerEntity = dealerEntity;
        this.customerEntity = customerEntity;
        this.carEntity = carEntity;
    }

    public SaleEntity() {
    }

    @Override
    public String toString() {
        return "SaleEntity{" +
                "saleId=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", dealerEntity=" + dealerEntity +
                ", customerEntity=" + customerEntity +
                ", carEntity=" + carEntity +
                '}';
    }
}

package com.fortech.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sales", schema = "dealer")
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "paymentType")
    private String paymentType;

    @Column(name = "orderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "dealers.ID", referencedColumnName = "ID")
    private DealerEntity dealerEntity;

    @ManyToOne
    @JoinColumn(name = "customers.ID", referencedColumnName = "ID")
    private CustomerEntity customerEntity;

    @ManyToOne
    @JoinColumn(name = "cars.ID", referencedColumnName = "ID")
    private CarEntity carEntity;

    public SaleEntity(String paymentType, Date orderDate, DealerEntity dealerEntity,
                      CustomerEntity customerEntity, CarEntity carEntity, String status) {
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        this.dealerEntity = dealerEntity;
        this.customerEntity = customerEntity;
        this.carEntity = carEntity;
        this.status = status;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SaleEntity{" +
                "ID=" + ID +
                ", paymentType='" + paymentType + '\'' +
                ", orderDate=" + orderDate +
                ", status='" + status + '\'' +
                ", dealerEntity=" + dealerEntity +
                ", customerEntity=" + customerEntity +
                ", carEntity=" + carEntity +
                '}';
    }
}

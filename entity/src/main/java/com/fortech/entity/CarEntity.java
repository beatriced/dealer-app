package com.fortech.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Cars")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "make")
    private String make;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private double price;

    @Column(name = "state")
    private String state;

    @Column(name = "fabricationYear")
    private Date fabricationYear;

    @Column(name = "registerDate")
    private Date registerDate;

    @ManyToOne
    @JoinColumn(name = "dealerID", referencedColumnName = "ID")
    private DealerEntity dealerEntity;

    @OneToMany(mappedBy = "carEntity", cascade = CascadeType.ALL)
    private List<SaleEntity> saleEntities;

    public CarEntity(String make, String model, String color, double price, String state,
                     Date fabricationYear, Date registerDate, DealerEntity dealerEntity,
                     List<SaleEntity> saleEntities) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.state = state;
        this.fabricationYear = fabricationYear;
        this.registerDate = registerDate;
        this.dealerEntity = dealerEntity;
        this.saleEntities = saleEntities;
    }

    public CarEntity() {
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "carID=" + ID +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", registerDate=" + registerDate +
                ", dealerEntity=" + dealerEntity +
                ", saleEntities=" + saleEntities +
                '}';
    }
}

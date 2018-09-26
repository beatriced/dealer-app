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

    @Column(name = "mark")
    private String mark;

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

    public CarEntity(String mark, String model, String color, double price, String state,
                     Date fabricationYear, Date registerDate, DealerEntity dealerEntity,
                     List<SaleEntity> saleEntities) {
        this.mark = mark;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String make) {
        this.mark = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(Date fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public DealerEntity getDealerEntity() {
        return dealerEntity;
    }

    public void setDealerEntity(DealerEntity dealerEntity) {
        this.dealerEntity = dealerEntity;
    }

    public List<SaleEntity> getSaleEntities() {
        return saleEntities;
    }

    public void setSaleEntities(List<SaleEntity> saleEntities) {
        this.saleEntities = saleEntities;
    }

    @Override
    public String toString() {
        return "CarEntity{" +
                "ID=" + ID +
                ", make='" + mark + '\'' +
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

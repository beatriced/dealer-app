package com.fortech.model;

import java.io.Serializable;
import java.util.Date;

public class CarDTO implements Serializable {

    private int ID;
    private String mark;
    private String model;
    private String color;
    private int price;
    private String state;
    private Date fabricationYear;
    private Date registerDate;

    public CarDTO() {
    }

    public CarDTO(int ID, String mark, String model, String color, int price, String state,
                  Date fabricationYear, Date registerDate) {
        this.ID = ID;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.price = price;
        this.state = state;
        this.fabricationYear = fabricationYear;
        this.registerDate = registerDate;
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

    public void setMark(String mark) {
        this.mark = mark;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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


    @Override
    public String toString() {
        return "CarDTO{" +
                "ID=" + ID +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", registerDate=" + registerDate +
                '}';
    }
}

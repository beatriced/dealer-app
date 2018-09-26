package com.fortech.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SearchCriteria implements Serializable {

    private List<String> mark;
    private String color;
    private List<String> state;
    private double price;
    private List<String> model;
    private Date fabricationYear;
    private Date registerDate;

    public List<String> getMark() {
        return mark;
    }

    public void setMark(List<String> mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getModel() {
        return model;
    }

    public void setModel(List<String> model) {
        this.model = model;
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
}

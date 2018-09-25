package com.fortech.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dealers")
public class DealerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "dealerEntity", cascade = CascadeType.ALL)
    private List<CarEntity> carEntityList;

    @OneToMany(mappedBy = "dealerEntity", cascade = CascadeType.ALL)
    private List<SaleEntity> saleEntityList;

    public DealerEntity(String lastName, String firstName, String password, String email,
                        List<CarEntity> carEntityList, List<SaleEntity> saleEntityList) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.password = password;
        this.email = email;
        this.carEntityList = carEntityList;
        this.saleEntityList = saleEntityList;
    }

    public DealerEntity() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CarEntity> getCarEntityList() {
        return carEntityList;
    }

    public void setCarEntityList(List<CarEntity> carEntityList) {
        this.carEntityList = carEntityList;
    }

    public List<SaleEntity> getSaleEntityList() {
        return saleEntityList;
    }

    public void setSaleEntityList(List<SaleEntity> saleEntityList) {
        this.saleEntityList = saleEntityList;
    }

    @Override
    public String toString() {
        return "DealerEntity{" +
                "id=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", carEntityList=" + carEntityList +
                ", saleEntityList=" + saleEntityList +
                '}';
    }
}

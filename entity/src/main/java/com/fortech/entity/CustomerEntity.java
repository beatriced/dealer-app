package com.fortech.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "Customers", cascade = CascadeType.ALL)
    private List<SaleEntity> saleEntityList;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SaleEntity> getSaleEntityList() {
        return saleEntityList;
    }

    public void setSaleEntityList(List<SaleEntity> saleEntityList) {
        this.saleEntityList = saleEntityList;
    }

    public CustomerEntity(String lastName, String firstName, String email, String password, String type,
                          List<SaleEntity> saleEntityList) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.type = type;
        this.saleEntityList = saleEntityList;
    }

    public CustomerEntity() {
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", saleEntityList=" + saleEntityList +
                '}';
    }
}

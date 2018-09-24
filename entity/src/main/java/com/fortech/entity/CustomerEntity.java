package com.fortech.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerID;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "password")
    private String password;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "Customers", cascade = CascadeType.ALL)
    private List<SaleEntity> saleEntityList;

    public CustomerEntity(String lastName, String firstName, String email, String password, String type,
                          List<SaleEntity> saleEntityList) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.type = type;
        this.saleEntityList = saleEntityList;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + customerID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", saleEntityList=" + saleEntityList +
                '}';
    }
}

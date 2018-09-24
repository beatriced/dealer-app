package com.fortech.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Dealers")
public class DealerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dealerID;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "email")
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

    @Override
    public String toString() {
        return "DealerEntity{" +
                "id=" + dealerID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", carEntityList=" + carEntityList +
                ", saleEntityList=" + saleEntityList +
                '}';
    }
}

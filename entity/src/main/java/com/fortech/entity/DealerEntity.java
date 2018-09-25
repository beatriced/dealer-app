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

package com.fortech.model;

import com.fortech.entity.DealerEntity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DealerDTO {

    public static final String namePattern = "[A-Z][a-z]+";
    private int ID;

    @Pattern(regexp = namePattern)
    private String lastName;

    @Pattern(regexp = namePattern)
    private String firstName;

    @Email
    private String email;

    @Size(min = 6)
    private String password;

    public DealerDTO(DealerEntity dealerEntity){
        this.ID=dealerEntity.getID();
        this.lastName=dealerEntity.getLastName();
        this.firstName=dealerEntity.getFirstName();
        this.email=dealerEntity.getEmail();
        this.password=dealerEntity.getPassword();
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

    public String getFisrtName() {
        return firstName;
    }

    public void setFisrtName(String firstName) {
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
}

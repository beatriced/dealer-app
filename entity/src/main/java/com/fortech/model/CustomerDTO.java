package com.fortech.model;

import com.fortech.entity.CustomerEntity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDTO {

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

    private String type;

    public CustomerDTO(CustomerEntity customerEntity){
        this.ID=customerEntity.getID();
        this.lastName=customerEntity.getLastName();
        this.firstName=customerEntity.getFirstName();
        this.email=customerEntity.getEmail();
        this.password=customerEntity.getPassword();
        this.type=customerEntity.getType();
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
}

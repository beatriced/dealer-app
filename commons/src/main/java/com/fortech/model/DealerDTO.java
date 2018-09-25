package com.fortech.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class DealerDTO {

    private int ID;
    private String lastName;
    private String firstName;

    @Email
    private String email;

    @Size(min = 6)
    private String password;

    public DealerDTO(int ID, String lastName, String firstName,
                     @Email String email, @Size(min = 6) String password) {
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
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

    @Override
    public String toString() {
        return "DealerDTO{" +
                "ID=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

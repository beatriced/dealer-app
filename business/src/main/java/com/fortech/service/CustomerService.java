package com.fortech.service;

import com.fortech.model.CustomerDTO;

import javax.ejb.Remote;

@Remote
public interface CustomerService {

    String login(String email, String password);
    void register(CustomerDTO customerDTO);
}

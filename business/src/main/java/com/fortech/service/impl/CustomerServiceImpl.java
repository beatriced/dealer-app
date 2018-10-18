package com.fortech.service.impl;

import com.fortech.model.CustomerDTO;
import com.fortech.service.CustomerService;
import repository.CustomerRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CustomerServiceImpl implements CustomerService {

    @EJB
    private CustomerRepository customerRepository;

    public String login(String email, String password) {

        return customerRepository.findByEmailAndPassword(email, password);
    }

    public void register(CustomerDTO customerDTO) {
        customerRepository.addCustomer(customerDTO);
    }
}

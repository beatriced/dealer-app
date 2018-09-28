package com.fortech.service;

import com.fortech.model.DealerDTO;

import javax.ejb.Remote;

@Remote
public interface DealerService {

    String login(String email, String password);
    void register(DealerDTO dealerDTO);
}

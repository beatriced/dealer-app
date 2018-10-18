package com.fortech.service.impl;

import com.fortech.model.DealerDTO;
import com.fortech.service.DealerService;
import repository.DealerRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class DealerServiceImpl implements DealerService {

    @EJB
    private DealerRepository dealerRepository;

    public String login(String email, String password) {

        return dealerRepository.findByEmailAndPassword(email, password);
    }

    public void register(DealerDTO dealerDTO) {
        dealerRepository.addDealer(dealerDTO);
    }
}

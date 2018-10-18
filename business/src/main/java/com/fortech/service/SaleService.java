package com.fortech.service;

import com.fortech.model.SaleDTO;

import javax.ejb.Remote;

@Remote
public interface SaleService {

    void add(SaleDTO saleDTO);
}

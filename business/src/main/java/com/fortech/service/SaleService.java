package com.fortech.service;

import com.fortech.model.SaleDTO;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface SaleService {

    void add(SaleDTO saleDTO);
    void update(SaleDTO saleDTO);
    List<SaleDTO> getAllSales();
}

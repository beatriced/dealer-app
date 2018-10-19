package com.fortech.service.impl;

import com.fortech.model.SaleDTO;
import com.fortech.service.SaleService;
import repository.SaleRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class SaleServiceImpl implements SaleService {

    @EJB
    private SaleRepository saleRepository;

    public void add(SaleDTO saleDTO) {
        saleRepository.add(saleDTO);
    }

    public void update(SaleDTO saleDTO) {
        saleRepository.update(saleDTO);
    }

    public List<SaleDTO> getAllSales() {
        return saleRepository.getAllSales();
    }
}

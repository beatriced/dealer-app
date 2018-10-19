package com.fortech.service;

import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface CarService {

    void add(CarDTO carDTO);

    List<CarDTO> search(SearchCriteria searchCriteria);

    void update(CarDTO carDTO);
}

package com.fortech.service;

import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;

import java.util.List;

public interface CarService {

    void add(CarDTO carDTO);

    List<CarDTO> search(SearchCriteria searchCriteria);
}

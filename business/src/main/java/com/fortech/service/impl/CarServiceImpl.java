package com.fortech.service.impl;

import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;
import com.fortech.service.CarService;
import repository.CarRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CarServiceImpl implements CarService {

    @EJB
    private CarRepository carRepository;

    public void add(CarDTO carDTO) {
        carRepository.add(carDTO);
    }

    public List<CarDTO> search(SearchCriteria searchCriteria) {
        return carRepository.search(searchCriteria);
    }
}

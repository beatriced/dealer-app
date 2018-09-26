package repository;

import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;

import java.util.List;

public interface CarRepository {

    void add(CarDTO carDTO);

    List<CarDTO> search(SearchCriteria searchCriteria);

    List<CarDTO> getAllCars();

    void deleteCar(CarDTO carDTO);

    void update(CarDTO carDTO);
}

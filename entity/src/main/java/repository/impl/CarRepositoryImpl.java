package repository.impl;

import com.fortech.entity.CarEntity;
import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;
import repository.CarRepository;

import javax.ejb.Remote;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Remote(CarRepository.class)
public class CarRepositoryImpl implements CarRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    List<CarDTO> carDTOList;

    private static Map<Integer, CarDTO> cars;

    public void add(CarDTO carDTO) {

        CarEntity carEntity = new CarEntity();

        carEntity.setMark(carDTO.getMark());
        carEntity.setModel(carDTO.getModel());
        carEntity.setColor(carDTO.getColor());
        carEntity.setPrice(carDTO.getPrice());
        carEntity.setState(carDTO.getState());
        carEntity.setFabricationYear(carDTO.getFabricationYear());
        carEntity.setRegisterDate(carDTO.getRegisterDate());

        entityManager.getTransaction().begin();
        entityManager.persist(carEntity);
        entityManager.getTransaction().commit();
    }

    public List<CarDTO> getAllCars() {
        return carDTOList;
    }

    public void deleteCar(CarDTO carDTO) {
        carDTOList.remove(carDTO.getID());
        System.out.print("Car: " + carDTO.getID() + " deleted from database");
    }

    public void update(CarDTO carDTO) {
        CarDTO car = cars.get(carDTO.getID());
        car.setPrice(carDTO.getPrice());
        car.setRegisterDate(carDTO.getRegisterDate());
        car.setFabricationYear(carDTO.getFabricationYear());
        car.setState(carDTO.getState());
        car.setColor(carDTO.getColor());
        car.setMark(carDTO.getMark());
        car.setModel(carDTO.getModel());

        cars.put(car.getID(), car);
    }

    public List<CarDTO> search(SearchCriteria searchCriteria) {

        List<CarEntity> carEntityList;
        StringBuilder search = new StringBuilder("Select car FROM CarEntity car WHERE 1=1");

        if (!searchCriteria.getMark().isEmpty()) {
            search.append("AND car.mark IN (:mark)");
        }

        if (!searchCriteria.getState().isEmpty()) {
            search.append("AND car.color IN (:state)");
        }

        if (!(searchCriteria.getColor() == null)) {
            search.append("AND car.color IN (:color)");
        }

        if (!(searchCriteria.getPrice() == 0)) {
            search.append("AND car.price IN (:price)");
        }

        if (!searchCriteria.getModel().isEmpty()) {
            search.append("AND car.model IN (:model)");
        }

        if (!(searchCriteria.getFabricationYear() == null)) {
            search.append("AND car.fabricationYear IN (:fabricationYear)");
        }

        if (!(searchCriteria.getRegisterDate() == null)) {
            search.append("AND car.registerDate IN (:registerDate)");
        }

        Query query = entityManager.createQuery(search.toString());

        if (!searchCriteria.getMark().isEmpty()) {
            query.setParameter("mark", searchCriteria.getMark());
        }

        if (!searchCriteria.getState().isEmpty()) {
            query.setParameter("state", searchCriteria.getState());
        }

        if (!(searchCriteria.getColor() == null)) {
            query.setParameter("color", searchCriteria.getColor());
        }

        if (!(searchCriteria.getPrice() == 0)) {
            query.setParameter("price", searchCriteria.getPrice());
        }

        if (!searchCriteria.getModel().isEmpty()) {
            query.setParameter("model", searchCriteria.getModel());
        }

        if (!(searchCriteria.getFabricationYear() == null)) {
            query.setParameter("fabricationYear", searchCriteria.getFabricationYear());
        }

        if (!(searchCriteria.getRegisterDate() == null)) {
            query.setParameter("registerDate", searchCriteria.getRegisterDate());
        }

        carEntityList = (List<CarEntity>) query.getResultList();

        if (carEntityList == null) {
            System.out.print("cars not found");
            return null;
        }

        List<CarDTO> result = new ArrayList<CarDTO>();

        for (CarEntity carEntity : carEntityList) {
            CarDTO carDTO = new CarDTO();

            carDTO.setMark(carEntity.getMark());
            carDTO.setColor(carEntity.getColor());
            carDTO.setState(carEntity.getState());
            carDTO.setFabricationYear(carEntity.getFabricationYear());
            carDTO.setRegisterDate(carEntity.getRegisterDate());
            carDTO.setPrice(carEntity.getPrice());

            result.add(carDTO);
        }

        return result;

    }
}

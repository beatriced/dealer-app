package repository.impl;

import com.fortech.entity.CustomerEntity;
import com.fortech.model.CustomerDTO;
import repository.CustomerRepository;

import javax.ejb.Remote;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Remote(CustomerRepository.class)
public class CutomerRepositoryImpl implements CustomerRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void addCustomer(CustomerDTO customerDTO) {

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setLastName(customerDTO.getLastName());
        customerEntity.setFirstName(customerDTO.getFirstName());
        customerEntity.setEmail(customerDTO.getEmail());
        customerEntity.setPassword(customerDTO.getPassword());
        customerEntity.setType(customerDTO.getType());

        entityManager.getTransaction().begin();
        entityManager.persist(customerEntity);
        entityManager.getTransaction().commit();
    }

}

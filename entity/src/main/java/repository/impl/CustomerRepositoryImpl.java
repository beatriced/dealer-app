package repository.impl;

import com.fortech.entity.CustomerEntity;
import com.fortech.model.CustomerDTO;
import repository.CustomerRepository;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Stateful
@Remote(CustomerRepository.class)
public class CustomerRepositoryImpl implements CustomerRepository {

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

    public String findByEmailAndPassword(String email, String password) {
        CustomerEntity customerEntity = new CustomerEntity();

        Query query = entityManager.createNamedQuery("customer.findCustomer");
        query.setParameter("email", email);
        customerEntity = (CustomerEntity) query.getSingleResult();

        return customerEntity.getFirstName();
    }

}

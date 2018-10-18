package repository.impl;

import com.fortech.entity.DealerEntity;
import com.fortech.model.DealerDTO;
import repository.DealerRepository;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Stateful
@Remote(DealerRepository.class)
public class DealerRepositoryImpl implements DealerRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void addDealer(DealerDTO dealerDTO) {

        DealerEntity dealerEntity = new DealerEntity();

        dealerEntity.setLastName(dealerDTO.getLastName());
        dealerEntity.setFirstName(dealerDTO.getFirstName());
        dealerEntity.setEmail(dealerDTO.getEmail());
        dealerEntity.setPassword(dealerDTO.getPassword());

        entityManager.getTransaction().begin();
        entityManager.persist(dealerEntity);
        entityManager.getTransaction().commit();
    }

    public String findByEmailAndPassword(String email, String password) {
        DealerEntity dealerEntity = new DealerEntity();

        Query query = entityManager.createNamedQuery("dealer.findDealer");
        query.setParameter("email", email);
        dealerEntity = (DealerEntity) query.getSingleResult();

        return dealerEntity.getFirstName();
    }
}

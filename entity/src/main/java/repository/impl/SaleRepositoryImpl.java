package repository.impl;

import com.fortech.entity.SaleEntity;
import com.fortech.model.SaleDTO;
import repository.SaleRepository;

import javax.ejb.Remote;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Remote(SaleRepository.class)
public class SaleRepositoryImpl implements SaleRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void add(SaleDTO saleDTO) {

        SaleEntity saleEntity = new SaleEntity();

        saleEntity.setOrderDate(saleDTO.getOrderDate());
        saleEntity.setPaymentType(saleDTO.getPaymentType());

        entityManager.getTransaction().begin();
        entityManager.persist(saleEntity);
        entityManager.getTransaction().commit();
    }
}

package repository.impl;

import com.fortech.entity.SaleEntity;
import com.fortech.model.SaleDTO;
import repository.SaleRepository;

import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Map;

@Stateful
@Remote(SaleRepository.class)
public class SaleRepositoryImpl implements SaleRepository {

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
    private EntityManager entityManager = entityManagerFactory.createEntityManager();

    private List<SaleDTO> saleDTOList;

    private Map<Integer, SaleDTO> sales;

    public void add(SaleDTO saleDTO) {

        SaleEntity saleEntity = new SaleEntity();

        saleEntity.setOrderDate(saleDTO.getOrderDate());
        saleEntity.setPaymentType(saleDTO.getPaymentType());

        entityManager.getTransaction().begin();
        entityManager.persist(saleEntity);
        entityManager.getTransaction().commit();
    }

    public List<SaleDTO> getAllSales() {
        return saleDTOList;
    }

    public void update(SaleDTO saleDTO) {
        SaleDTO sale = sales.get(saleDTO.getID());
        sale.setOrderDate(saleDTO.getOrderDate());
        sale.setPaymentType(saleDTO.getPaymentType());
        sale.setStatus(saleDTO.getStatus());

        sales.put(sale.getID(), sale);
    }
}

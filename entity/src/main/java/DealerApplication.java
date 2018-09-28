import com.fortech.entity.DealerEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DealerApplication {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        DealerEntity dealerEntity = new DealerEntity();

//        dealerEntity.setLastName("lastName");
//        dealerEntity.setFirstName("firstName");

//        dealerEntity.setPassword("fagfdrs");

//        dealerEntity.setEmail("gvdrf@gmai.com");

//        dealerEntity.setPassword("fsdvg");
//        dealerEntity.setEmail("vgfr@gmail.com");
//        dealerEntity.setFirstName("vgs");
//        dealerEntity.setLastName("grfsg");
//
        entityManager.persist(dealerEntity);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();

    }
}

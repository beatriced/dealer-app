package repository;

import com.fortech.model.DealerDTO;

public interface DealerRepository {

    void addDealer(DealerDTO dealerDTO);
    String findByEmailAndPassword(String email, String password);
}

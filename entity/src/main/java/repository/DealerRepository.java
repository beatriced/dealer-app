package repository;

import com.fortech.model.DealerDTO;

public interface DealerRepository {

    void register(DealerDTO dealerDTO);
    void login(DealerDTO dealerDTO);
}

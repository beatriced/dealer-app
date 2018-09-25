package repository;
import com.fortech.model.CustomerDTO;

public interface CustomerRepository {

    void register(CustomerDTO customerDTO);
    void login(CustomerDTO customerDTO);
}

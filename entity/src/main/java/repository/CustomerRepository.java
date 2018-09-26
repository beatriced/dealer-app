package repository;
import com.fortech.model.CustomerDTO;

public interface CustomerRepository {

    void addCustomer(CustomerDTO customerDTO);
    String findByEmailAndPassword(String email, String password);
}

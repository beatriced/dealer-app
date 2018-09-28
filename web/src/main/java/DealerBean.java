import com.fortech.model.DealerDTO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class DealerBean {

    private String email;
    private String password;
    private DealerDTO dealerDTO = new DealerDTO();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DealerDTO getDealerDTO() {
        return dealerDTO;
    }

    public void setDealerDTO(DealerDTO dealerDTO) {
        this.dealerDTO = dealerDTO;
    }
}

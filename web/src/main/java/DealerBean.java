import com.fortech.model.DealerDTO;
import com.fortech.service.DealerService;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class DealerBean {

    private String email;
    private String password;
    private DealerDTO dealerDTO = new DealerDTO();

    @EJB
    private DealerService dealerService;

    public String login() {

        String dealer = dealerService.login(email, password);
        if (!dealer.isEmpty()) {
            return "homeDealer.xhtml?faces-redirect=true";
        } else {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage("Bad credentials"));
            facesContext.getExternalContext().getFlash().setKeepMessages(true);
            return "dealerLogin.xhtml?faces-redirect=true";
        }
    }

    public String register() {

        dealerService.register(dealerDTO);
        return "dealerLogin.xhtml?faces-redirect=true";
    }

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

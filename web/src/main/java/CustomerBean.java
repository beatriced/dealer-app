import com.fortech.model.CustomerDTO;
import com.fortech.service.CustomerService;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class CustomerBean {

    private String email;
    private String password;
    private CustomerDTO customerDTO = new CustomerDTO();

    @EJB
    private CustomerService customerService;

    public String login() {

        String customer = customerService.login(email, password);
        if (!customer.isEmpty()) {
            return "homeCustomer.xhtml?faces-redirect=true";
        } else {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.addMessage(null, new FacesMessage("Bad credentials"));
            facesContext.getExternalContext().getFlash().setKeepMessages(true);
            return "customerLogin.xhtml?faces-redirect=true";
        }
    }

    public String register() {

        customerService.register(customerDTO);
        return "customerLogin.xhtml?faces-redirect=true";
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

    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }
}

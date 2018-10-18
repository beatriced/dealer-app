import com.fortech.model.SaleDTO;
import com.fortech.service.SaleService;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.Date;

@ManagedBean
@RequestScoped
public class SaleBean {

    private String paymentType;
    private Date orderDate;
    private SaleDTO saleDTO;

    @EJB
    private SaleService saleService;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public SaleDTO getSaleDTO() {
        return saleDTO;
    }

    public void setSaleDTO(SaleDTO saleDTO) {
        this.saleDTO = saleDTO;
    }
}

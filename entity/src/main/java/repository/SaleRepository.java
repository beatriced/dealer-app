package repository;

import com.fortech.model.SaleDTO;

import java.util.List;

public interface SaleRepository {

    void add(SaleDTO saleDTO);

    List<SaleDTO> getAllSales();

    void update(SaleDTO saleDTO);
}

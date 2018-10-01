import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;
import com.fortech.service.CarService;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import java.util.List;
import javax.faces.model.SelectItem;

@ManagedBean
@RequestScoped
public class CarBean {

    @EJB
    private CarService carService;

    private CarDTO carDTO;
    private List<CarDTO> carDTOList;
    private SearchCriteria searchCriteria;
    private List<SelectItem> colors;
    private List<SelectItem> marks;
    private List<SelectItem> models;
    private List<SelectItem> states;

    public String add(){
        carService.add(carDTO);
        return "add?faces-redirect=true";
    }

    public void search(){
        carDTOList=carService.search(searchCriteria);
    }

    public CarService getCarService() {
        return carService;
    }

    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    public CarDTO getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
    }

    public List<CarDTO> getCarDTOList() {
        return carDTOList;
    }

    public void setCarDTOList(List<CarDTO> carDTOList) {
        this.carDTOList = carDTOList;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<SelectItem> getColors() {
        return colors;
    }

    public void setColors(List<SelectItem> colors) {
        this.colors = colors;
    }

    public List<SelectItem> getMarks() {
        return marks;
    }

    public void setMarks(List<SelectItem> marks) {
        this.marks = marks;
    }

    public List<SelectItem> getModels() {
        return models;
    }

    public void setModels(List<SelectItem> models) {
        this.models = models;
    }

    public List<SelectItem> getStates() {
        return states;
    }

    public void setStates(List<SelectItem> states) {
        this.states = states;
    }
}

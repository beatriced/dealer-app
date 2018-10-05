import com.fortech.model.CarDTO;
import com.fortech.model.SearchCriteria;
import com.fortech.service.CarService;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class CarBean {

    private CarDTO carDTO = new CarDTO();
    private List<SelectItem> marks;
    private List<SelectItem> models;
    private List<SelectItem> colors;
    private List<SelectItem> price;
    private List<SelectItem> state;
    private List<SelectItem> fabricationYear;
    private List<SelectItem> registerDate;
    private SearchCriteria searchCriteria;

    private List<CarDTO> carDTOList;

    @EJB
    private CarService carService;

    public String add() {
        carService.add(carDTO);
        return "add?faces-redirect=true";
    }

    @PostConstruct
    public void initialize() {
        carDTOList = new ArrayList<CarDTO>();
        marks = new ArrayList<SelectItem>();

        SelectItemGroup germanCars = new SelectItemGroup("germanCars");
        germanCars.setSelectItems(new SelectItem[]{
                new SelectItem("BMW", "BMW"),
                new SelectItem("Mercedes", "Mercedes")
        });
        SelectItemGroup frenchCars = new SelectItemGroup("frenchCars");
        frenchCars.setSelectItems(new SelectItem[]{
                new SelectItem("Peugeot", "Peugeot"),
                new SelectItem("Bugatti", "Bugatti")
        });

        marks.add(germanCars);
        marks.add(frenchCars);

        models = new ArrayList<SelectItem>();

        SelectItemGroup BMWModels = new SelectItemGroup("BMWModels");
        BMWModels.setSelectItems(new SelectItem[]{
                new SelectItem("X5", "X5"),
                new SelectItem("X6", "X6")
        });

        SelectItemGroup mercedesModels = new SelectItemGroup("mercedesModels");
        mercedesModels.setSelectItems(new SelectItem[]{
                new SelectItem("S class", "S class"),
                new SelectItem("A class", "A class"),
                new SelectItem("E class", "E class")
        });

        SelectItemGroup peugeotModels = new SelectItemGroup("peugeotModels");
        peugeotModels.setSelectItems(new SelectItem[]{
                new SelectItem("508", "508"),
                new SelectItem("3008", "3008")
        });

        SelectItemGroup bugattiModels=new SelectItemGroup("bugattiModels");
        bugattiModels.setSelectItems(new SelectItem[]{
                new SelectItem("divo","divo"),
                new SelectItem("chiron sport","chiron sport")
        });

        models.add(BMWModels);
        models.add(mercedesModels);
        models.add(peugeotModels);
        models.add(bugattiModels);

        colors = new ArrayList<SelectItem>();
        colors.add(new SelectItem("black", "black"));
        colors.add(new SelectItem("white", "white"));

        state = new ArrayList<SelectItem>();
        state.add(new SelectItem("new", "new"));
        state.add(new SelectItem("used", "used"));

        searchCriteria = new SearchCriteria();
    }

    public void search() {
        carDTOList = carService.search(searchCriteria);
    }

    public CarDTO getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
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

    public List<SelectItem> getColors() {
        return colors;
    }

    public void setColors(List<SelectItem> colors) {
        this.colors = colors;
    }

    public List<SelectItem> getPrice() {
        return price;
    }

    public void setPrice(List<SelectItem> price) {
        this.price = price;
    }

    public List<SelectItem> getState() {
        return state;
    }

    public void setState(List<SelectItem> state) {
        this.state = state;
    }

    public List<SelectItem> getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(List<SelectItem> fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public List<SelectItem> getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(List<SelectItem> registerDate) {
        this.registerDate = registerDate;
    }

    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public List<CarDTO> getCarDTOList() {
        return carDTOList;
    }

    public void setCarDTOList(List<CarDTO> carDTOList) {
        this.carDTOList = carDTOList;
    }

    public CarService getCarService() {
        return carService;
    }

    public void setCarService(CarService carService) {
        this.carService = carService;
    }
}

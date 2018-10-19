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

    private CarDTO carDTO;
    private List<SelectItem> marks;
    private List<SelectItem> models;
    private List<SelectItem> colors;
    private List<SelectItem> state;
    private SearchCriteria searchCriteria;
    private List<CarDTO> carDTOList;

    @EJB
    private CarService carService;

    @PostConstruct
    public void initialize() {

        carDTOList = new ArrayList<CarDTO>();
        colors = new ArrayList<SelectItem>();
        colors.add(new SelectItem("black", "black"));
        colors.add(new SelectItem("grey", "grey"));
        colors.add(new SelectItem("white", "white"));

        state = new ArrayList<SelectItem>();
        state.add(new SelectItem("used", "used"));
        state.add(new SelectItem("new", "new"));

        marks = new ArrayList<SelectItem>();
        SelectItemGroup germanCars = new SelectItemGroup("german cars");
        germanCars.setSelectItems(new SelectItem[]{
                new SelectItem("Audi", "Audi"),
                new SelectItem("BMW", "BMW")
        });

        SelectItemGroup frenchCars = new SelectItemGroup("french cars");
        frenchCars.setSelectItems(new SelectItem[]{
                new SelectItem("Peugeot", "Peugeot"),
                new SelectItem("Bugatti", "Bugatti")
        });

        marks.add(germanCars);
        marks.add(frenchCars);

        models = new ArrayList<SelectItem>();
        SelectItemGroup bmwModels = new SelectItemGroup("BMW models");
        bmwModels.setSelectItems(new SelectItem[]{
                new SelectItem("X5", "X5"),
                new SelectItem("X6", "X6")
        });

        SelectItemGroup peugeotModels = new SelectItemGroup("Peugeot models");
        peugeotModels.setSelectItems(new SelectItem[]{
                new SelectItem("508", "508"),
                new SelectItem("3008", "3008")
        });

        SelectItemGroup audiModels = new SelectItemGroup("Audi models");
        audiModels.setSelectItems(new SelectItem[]{
                new SelectItem("A6", "A6"),
                new SelectItem("A4", "A4")
        });

        SelectItemGroup bugattiModels = new SelectItemGroup("Bugatti models");
        bugattiModels.setSelectItems(new SelectItem[]{
                new SelectItem("divo", "divo"),
                new SelectItem("chiron sport", "chiron sport")
        });

        models.add(bmwModels);
        models.add(peugeotModels);
        models.add(audiModels);
        models.add(bugattiModels);

    }

    public void search() {
        carDTOList = carService.search(searchCriteria);
    }

    public String add() {
        carService.add(carDTO);
        return "addCar.xhtml?faces-redirect=true";
    }

    public String update(){
        carService.update(carDTO);
        return "updateCar.xhtml?faces-redirect=true";
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

    public List<SelectItem> getState() {
        return state;
    }

    public void setState(List<SelectItem> state) {
        this.state = state;
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

}

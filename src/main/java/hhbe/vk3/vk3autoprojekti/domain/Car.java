package hhbe.vk3.vk3autoprojekti.domain;

public class Car {
    // attribuutit
    private String model;
    private Integer year;
    //konstruktorit
    //getterit ja setterit
    //tostring
    
    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }
    public Car() {
        this.model = null;
        this.year = null;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + "]";
    }
    
}

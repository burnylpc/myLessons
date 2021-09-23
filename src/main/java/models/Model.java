package models;

import brands.Brand;

public class Model {

    private String name;
    private String country;
    private String model;

    public Model(Brand brand, String model){
        this.name = brand.nameBrand();
        this.country = brand.country();
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public  String getModel() {
        return model;
    }

    public String toString() {
        return "This model: " + name + " " + model + ", " + country;
    }
}

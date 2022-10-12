package com.gardhagen.WigellkoncernenCarRental.models.cars;



import javax.persistence.*;

@Entity
@Table
public class Car {
    @Id
    @SequenceGenerator(
            name = "automobile_sequence",
            sequenceName = "automobile_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "automobile_sequence"
    )
    private long id;
    private String brand;
    private String fuelType;
    private String color;
    private int modelYear;
    boolean stolen;


    public Car() {
    }

    public Car(long id, String brand, String fuelType, String color, int modelYear, boolean stolen) {
        this.id = id;
        this.brand = brand;
        this.fuelType = fuelType;
        this.color = color;
        this.modelYear = modelYear;
        this.stolen = stolen;

    }

    public Car(String brand, String fuelType, String color, int modelYear, boolean stolen) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.color = color;
        this.modelYear = modelYear;
        this.stolen = stolen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean isStolen() {
        return stolen;
    }

    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }
}

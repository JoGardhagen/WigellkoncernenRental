package com.gardhagen.WigellkoncernenCarRental.dto;

public class RentalPriceCurrencyExchangeDTO {

    private long carId;
    private String carBrand;
    private int carModelYear;
    private double carRentalPrice;
    private String currencyName;
    private double currencyValue;

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarModelYear() {
        return carModelYear;
    }

    public void setCarModelYear(int carModelYear) {
        this.carModelYear = carModelYear;
    }

    public double getCarRentalPrice() {
        return carRentalPrice;
    }

    public void setCarRentalPrice(double carRentalPrice) {
        this.carRentalPrice = carRentalPrice;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(double currencyValue) {
        this.currencyValue = currencyValue;
    }
}

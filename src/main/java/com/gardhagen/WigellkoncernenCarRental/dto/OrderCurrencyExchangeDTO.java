package com.gardhagen.WigellkoncernenCarRental.dto;


import java.sql.Date;

public class OrderCurrencyExchangeDTO {
    private long rentalId;
    private long custumerId;
    private long carId;
    private String customerFirstName;
    private String customerLastName;
    private String carBrand;
    private double carRentalCost;
    private int rentalDays;
    private Date orderdate;
    private double totalCost;
    private String currencyName;
    private double currencyValue;
    private double exchangedValue;


    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public double getExchangedValue() {
        return exchangedValue;
    }

    public void setExchangedValue(double exchangedValue) {
        this.exchangedValue = exchangedValue;
    }

    public long getRentalId() {
        return rentalId;
    }

    public void setRentalId(long rentalId) {
        this.rentalId = rentalId;
    }

    public long getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(long custumerId) {
        this.custumerId = custumerId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getCarRentalCost() {
        return carRentalCost;
    }

    public void setCarRentalCost(double carRentalCost) {
        this.carRentalCost = carRentalCost;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
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

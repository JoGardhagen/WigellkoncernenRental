package com.gardhagen.WigellkoncernenCarRental.VO;

public class Currency {

    private long id;
    private String currencyName;
    private double value;

    public Currency() {
    }

    public Currency(long id, String currencyName, double value) {
        this.id = id;
        this.currencyName = currencyName;
        this.value = value;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

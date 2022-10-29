package com.gardhagen.WigellkoncernenCarRental.VO;

import com.gardhagen.WigellkoncernenCarRental.models.Rent;

public class ResponseTemplateRentalVO {
    private Rent rent;
    private Currency currency;

    public ResponseTemplateRentalVO() {
    }

    public ResponseTemplateRentalVO(Rent rent, Currency currency) {
        this.rent = rent;
        this.currency = currency;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

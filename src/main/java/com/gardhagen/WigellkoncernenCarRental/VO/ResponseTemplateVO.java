package com.gardhagen.WigellkoncernenCarRental.VO;

import com.gardhagen.WigellkoncernenCarRental.models.Car;

public class ResponseTemplateVO {

    private Car car;
    private Currency currency;

    public ResponseTemplateVO() {
    }

    public ResponseTemplateVO(Car car, Currency currency) {
        this.car = car;
        this.currency = currency;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

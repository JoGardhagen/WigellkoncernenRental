package com.gardhagen.WigellkoncernenCarRental.dto;


public class CustomerAddressDTO {
    private long userId;
    private String userName;
    private String email;
    private String place;
    private int postalNr;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPostalNr() {
        return postalNr;
    }

    public void setPostalNr(int postalNr) {
        this.postalNr = postalNr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

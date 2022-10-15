package com.gardhagen.WigellkoncernenCarRental.models;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @SequenceGenerator(
            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_sequence"
    )
    private long id;
    private String locationName;
    private int postalNr;

    public Address() {
    }

    public Address(String locationName, int postalNr) {
        this.locationName = locationName;
        this.postalNr = postalNr;
    }

    public Address(long id, String locationName, int postalNr) {
        this.id = id;
        this.locationName = locationName;
        this.postalNr = postalNr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getPostalNr() {
        return postalNr;
    }

    public void setPostalNr(int postalNr) {
        this.postalNr = postalNr;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", location='" + locationName + '\'' +
                ", postal_number=" + postalNr +
                '}';
    }
}

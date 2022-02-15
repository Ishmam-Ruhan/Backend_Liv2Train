package com.ishmamruhan.Liv2Train.Models;

import javax.persistence.*;

@Entity
@Table(name = "center_addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String details;
    private String city;
    private String state;
    private String pincode;

    public Address() {
    }

    public Address(String details, String city, String state, String pinCode) {
        this.details = details;
        this.city = city;
        this.state = state;
        this.pincode = pinCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}

package com.example.orderexample.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
public class CustomerAddress extends BaseModel{
    private String phoneNumber;
    private String country;
    private String city;
    private String postalCode;
    private String description;

    @OneToOne
    @JsonIgnore     //Burada kod sonsuz döngüye giriyor. Ignore ederek bu alanı göstermiyoruz.
    private Customer customer;

}

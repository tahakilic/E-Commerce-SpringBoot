package com.example.orderexample.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Customer extends BaseExtendModel{
    private String username;
    private String email;
    private Long identity;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String password;

    @OneToOne( mappedBy = "customer",cascade = CascadeType.ALL)
    private CustomerAddress customerAddress;

}

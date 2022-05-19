package com.example.orderexample.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class Category extends BaseModel{
    @OneToOne
    private Category parent;

    private String name;

}

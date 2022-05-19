package com.example.orderexample.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Product extends BaseExtendModel{
    private String name;
    private BigDecimal price;
    private UUID barcode;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Category category;
}

package com.example.orderexample.model;

import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class BasketItem extends BaseModel{

    @ManyToOne(optional = false)
    private Basket basket;

    @ManyToOne(optional = false)
    private Product product;

    @Column(nullable = false)
    private BigDecimal quantity;
    @Column(nullable = false)
    private BigDecimal price=BigDecimal.ZERO; //Herhangi bir tanımlama yapılmaz ise 0 ile dolduracak null olunca NullPointerException fırlatır ondan kaçmak için 0'a eşitledik.
    private BigDecimal discountPrice=BigDecimal.ZERO;
    private BigDecimal taxPrice=BigDecimal.ZERO;
    private BigDecimal shippingPrice=BigDecimal.ZERO;

}

package com.example.orderexample.converter;

import com.example.orderexample.dto.CustomerDTO;
import com.example.orderexample.model.Customer;

public interface CustomerConverter {

    Customer convert(CustomerDTO customerDTO);

    CustomerDTO convert(Customer customer);

}

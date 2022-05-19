package com.example.orderexample.service;

import com.example.orderexample.dto.CustomerDTO;

public interface CustomerService {
    void create(CustomerDTO customerDTO);

    CustomerDTO getCustomer(Long id);
}

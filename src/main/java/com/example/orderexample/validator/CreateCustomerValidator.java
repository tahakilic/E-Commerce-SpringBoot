package com.example.orderexample.validator;

import com.example.orderexample.dto.CustomerDTO;
import com.example.orderexample.exception.BaseException;

public interface CreateCustomerValidator {
    void validate(CustomerDTO customerDTO) throws BaseException;
}

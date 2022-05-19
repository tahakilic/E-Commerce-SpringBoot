package com.example.orderexample.validator;

import com.example.orderexample.dto.CustomerDTO;
import com.example.orderexample.exception.BaseException;
import com.example.orderexample.exception.ControllerOperationException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Objects;

@Component
public class CreateCustomerValidatorImpl implements CreateCustomerValidator {
    @Override
    public void validate(CustomerDTO customerDTO) throws BaseException {

        if(Objects.isNull(customerDTO)){
            throw new ControllerOperationException.CustomerNotValidException("Customer can not be null or empty");
        }
        if(!(StringUtils.hasLength(customerDTO.userName()))){
            throw new ControllerOperationException.CustomerNotValidException("Customer username can not be null or empty");
        }
        if(!(StringUtils.hasLength(customerDTO.password()))){
            throw new ControllerOperationException.CustomerNotValidException("Customer password can not be null or empty");
        }
        if(Objects.isNull(customerDTO.identity())){
            throw new ControllerOperationException.CustomerNotValidException("Customer identity can not be null or empty");
        }
        if(Objects.isNull(customerDTO.gender())){
            throw new ControllerOperationException.CustomerNotValidException("Customer gender can not be null or empty");
        }

    }
}

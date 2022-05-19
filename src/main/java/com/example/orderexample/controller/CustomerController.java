package com.example.orderexample.controller;

import com.example.orderexample.dto.CustomerDTO;
import com.example.orderexample.exception.ControllerOperationException;
import com.example.orderexample.service.CustomerService;
import com.example.orderexample.validator.CreateCustomerValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/customers")
public class CustomerController {
    private final CreateCustomerValidator createCustomerValidator;
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CustomerDTO customerDTO){
        createCustomerValidator.validate(customerDTO);
        customerService.create(customerDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Long id){
        if(id<0){
            throw new ControllerOperationException.CustomerIDNotValidException("Customer ID should be greater than zero.");
        }
       return ResponseEntity.ok(customerService.getCustomer(id));
    }
}

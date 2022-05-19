package com.example.orderexample.service;

import com.example.orderexample.converter.CustomerConverter;
import com.example.orderexample.dto.CustomerDTO;
import com.example.orderexample.exception.ControllerOperationException;
import com.example.orderexample.exception.ServiceOperationException;
import com.example.orderexample.model.Customer;
import com.example.orderexample.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerConverter customerConverter;
    private final CustomerRepository customerRepository;


    @Override
    public void create(CustomerDTO customerDTO) {
        Customer customer = customerConverter.convert(customerDTO);
        customerRepository.save(customer);

    }

    @Override
    @Transactional
    public CustomerDTO getCustomer(Long id) {
        Customer customer=customerRepository
                .findById(id)
                .orElseThrow(()-> new ServiceOperationException.CustomerNotFoundException("Customer not found!"));
        return customerConverter.convert(customer);
    }
}

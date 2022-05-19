package com.example.orderexample.converter;

import com.example.orderexample.dto.CustomerAddressDTO;
import com.example.orderexample.dto.CustomerDTO;
import com.example.orderexample.model.Customer;
import com.example.orderexample.model.CustomerAddress;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CustomerConverterImpl implements CustomerConverter {
    @Override
    public Customer convert(CustomerDTO customerDTO) {

        Customer customer = new Customer();
        customer.setUsername(customerDTO.userName());
        customer.setEmail(customerDTO.email());
        customer.setIdentity(customerDTO.identity());
        customer.setGender(customerDTO.gender());
        customer.setPassword(customerDTO.password());
        customer.setCreatedAt(new Date());
        customer.setCreatedBy("TahaKılıç");

        CustomerAddress customerAddress=new CustomerAddress();
        customerAddress.setPhoneNumber(customerDTO.customerAddress().getPhoneNumber());
        customerAddress.setCountry(customerDTO.customerAddress().getCountry());
        customerAddress.setCity(customerDTO.customerAddress().getCity());
        customerAddress.setPostalCode(customerDTO.customerAddress().getPostalCode());
        customerAddress.setDescription(customerDTO.customerAddress().getDescription());
        customerAddress.setCustomer(customer);

        customer.setCustomerAddress(customerAddress);

        return customer;

    }

    @Override
    public CustomerDTO convert(Customer customer) {
        return new CustomerDTO(customer.getUsername(),
                customer.getEmail(),
                customer.getIdentity(),
                customer.getGender(),
                customer.getPassword(),
                customer.getCustomerAddress());

    }



}

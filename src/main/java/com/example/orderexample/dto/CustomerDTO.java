package com.example.orderexample.dto;

import com.example.orderexample.model.CustomerAddress;
import com.example.orderexample.model.Gender;

public record CustomerDTO(String userName, String email, Long identity, Gender gender, String password,
                          CustomerAddress customerAddress) {

}

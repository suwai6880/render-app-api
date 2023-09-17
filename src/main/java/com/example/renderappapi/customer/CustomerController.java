package com.example.renderappapi.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
    private static final List<Customer> CUSTOMERS= List.of(
            new Customer(1L,"John","doe","john@javawhizz.com"),
            new Customer(2L,"yoon","mi","yoonmi@gmail.com"),
            new Customer(3L,"nandar","hlaing","nandarhlaing@gmail.com"),
            new Customer(4L,"aye","su","ayesu@gmail.com")
    );

    @GetMapping
    public List<Customer> findAllCustomers(){
        return CUSTOMERS;
    }
}

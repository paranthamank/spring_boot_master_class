package com.parthaa.springbootmasterclass.helloworld.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(@Qualifier(value = "fake") CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers(){
        return  customerRepo.getCustomers();
    }

}

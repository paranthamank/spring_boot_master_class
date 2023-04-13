package com.parthaa.springbootmasterclass.helloworld.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomers(){
        return  customerRepo.getCustomers();
    }

    Customer getCustomer(Long id){
        return customerRepo.getCustomers ()
                .stream ()
                .filter (customer -> customer.getId ()
                        .equals (id))
                .findFirst ()
                .orElseThrow (() -> new IllegalStateException ("Customer Not Found"));
    }

}

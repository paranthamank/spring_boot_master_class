package com.parthaa.springbootmasterclass.helloworld.customer;


import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    Customer getCustomer(){
        return  new Customer(1L,"Parthaa");
    }

}

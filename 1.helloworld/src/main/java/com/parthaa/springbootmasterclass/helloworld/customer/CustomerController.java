package com.parthaa.springbootmasterclass.helloworld.customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @GetMapping("/customer")
    Customer getCustomer(){
        return  new Customer(1L,"Parthaa");
    }
}

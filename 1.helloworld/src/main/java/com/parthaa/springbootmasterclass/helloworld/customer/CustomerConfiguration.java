package com.parthaa.springbootmasterclass.helloworld.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private  Boolean useFakeCustomerRepo;
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            //TODO set initial db values
        };
    }

    // return CustomerRepo Bean
    @Bean
    CustomerRepo customerRepo(){
        return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
    }

}

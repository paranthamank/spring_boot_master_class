package com.parthaa.springbootmasterclass.helloworld.customer;


import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerFakeRepository implements  CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"Parthaa"),new Customer(2L,"Paranthaman")
        );
    }
}

package com.parthaa.springbootmasterclass.helloworld.customer;



import java.util.Collections;
import java.util.List;

//@Repository
//@Primary
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        //TODO Connect to real DB
        return Collections.emptyList();
    }
}

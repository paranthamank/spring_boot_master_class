package com.parthaa.springbootmasterclass.helloworld.customer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerControllerV2 {
    private final CustomerService customerService;
    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    List<Customer> getCustomer(){
        return  customerService.getCustomers();
    }

    @PostMapping()
    void createNewCustomer(@Valid @RequestBody Customer customer){
        System.out.println("POST REQUEST TO CREATE A NEW CUSTOMER");
        System.out.println(customer);

    }

    @PutMapping()
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT REQUEST TO UPDATE A CUSTOMER");
        System.out.println(customer);

    }


    @DeleteMapping(path = "/{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST TO DELETE A CUSTOMER Id:" + id);
    }
}

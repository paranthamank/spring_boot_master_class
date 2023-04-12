package com.parthaa.springbootmasterclass.helloworld.customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;


@RestController
public class CustomerController {
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    List<Customer> getCustomer(){
        return  customerService.getCustomers();
    }

    @PostMapping("/customer")
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("POST REQUEST TO CREATE A NEW CUSTOMER");
        System.out.println(customer);

    }

    @PutMapping("/customer")
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUT REQUEST TO UPDATE A CUSTOMER");
        System.out.println(customer);

    }


    @DeleteMapping(path = "{customerId}",name = "/customer")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST TO DELETE A CUSTOMER" + id);
    }
}

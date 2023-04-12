package com.parthaa.springbootmasterclass.helloworld.customer;

import jakarta.validation.constraints.NotBlank;

public class Customer{

    private final Long id;
    @NotBlank
    private final String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

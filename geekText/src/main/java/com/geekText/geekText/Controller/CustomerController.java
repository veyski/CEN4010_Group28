package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Customer;
import com.geekText.geekText.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/addCustomer")
    public Customer postDetails(@RequestBody Customer customer) {
        return customerService.saveDetails(customer);

    }

}

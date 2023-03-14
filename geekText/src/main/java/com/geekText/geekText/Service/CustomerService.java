package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Customer;
import com.geekText.geekText.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer saveDetails(Customer customer){

        return customerRepo.save(customer);
    }
}
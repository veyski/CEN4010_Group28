package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Orders;
import com.geekText.geekText.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public Orders saveDetails(Orders order){

        return orderRepo.save(order);
    }
}
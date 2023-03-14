package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Orders;
import com.geekText.geekText.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/addOrder")
    public Orders postDetails(@RequestBody Orders order) {
        return orderService.saveDetails(order);

    }

}

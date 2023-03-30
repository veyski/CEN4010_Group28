package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.User;
import com.geekText.geekText.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/addCustomer")
    public User postDetails(@RequestBody User user) {
        return userService.saveDetails(user);

    }

}

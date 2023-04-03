package com.geekText.geekText.Controller;

import com.CEN4010.CEN4010.Entity.CreditCard;
import com.CEN4010.CEN4010.Entity.User;
import com.CEN4010.CEN4010.Service.CreditCardService;
import com.CEN4010.CEN4010.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/addUser")
    public User postDetails(@RequestBody User user)
    {
        return userService.save(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getDetails()
    {
        return userService.getDetails();
    }

    @GetMapping("/getUser/{username}")
    public Optional<User> findByUsername(@PathVariable("username") String username, User user)
    {
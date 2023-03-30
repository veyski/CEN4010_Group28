package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.User;
import com.geekText.geekText.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User saveDetails(User user){

        return userRepo.save(user);
    }
}
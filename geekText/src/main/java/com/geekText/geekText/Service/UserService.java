package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.User;
import com.geekText.geekText.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User save(User user)
    {
        return userRepo.save(user);
    }

    public List<User> getDetails()
    {
        return userRepo.findAll();
    }

  /*  public Optional<User> findByUsername(String username)
    {
        return userRepo.findByUsername(username);
    }
        NOT COMPILING */
}
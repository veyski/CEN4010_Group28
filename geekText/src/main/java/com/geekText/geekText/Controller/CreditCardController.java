package com.geekText.geekText.Controller;

import com.CEN4010.CEN4010.Entity.CreditCard;
import com.CEN4010.CEN4010.Entity.User;
import com.CEN4010.CEN4010.Service.CreditCardService;
import com.CEN4010.CEN4010.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CreditCardController {
    @Autowired
    private CreditCardService creditCardService;
    @PostMapping("/addCreditCard")
    public CreditCard postDetails(@RequestBody CreditCard creditCard)
    {
        return creditCardService.save(creditCard);
    }


}
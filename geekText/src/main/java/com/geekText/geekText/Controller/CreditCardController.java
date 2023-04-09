package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.CreditCard;
import com.geekText.geekText.Entity.User;
import com.geekText.geekText.Service.CreditCardService;
import com.geekText.geekText.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
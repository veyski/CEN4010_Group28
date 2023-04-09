package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.CreditCard;
import com.geekText.geekText.Repository.CreditCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditCardService {
    @Autowired
    private CreditCardRepo creditCardRepo;

    public CreditCard save(CreditCard creditCard){

        return creditCardRepo.save(creditCard);
    }

}
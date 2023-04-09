package com.geekText.geekText.Service;

import com.CEN4010.CEN4010.Entity.CreditCard;
import com.CEN4010.CEN4010.Repository.CreditCardRepo;
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
package com.geekText.geekText.Repository;

import com.geekText.geekText.Entity.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardRepo extends JpaRepository<CreditCard, Integer> {

}

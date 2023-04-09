package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "credit_card")

@NoArgsConstructor
@AllArgsConstructor
public class CreditCard {
    @Id
    @Column(name = "credit_card_number")
    private int credit_card_number;

    @Column(name = "bank_name")
    private String bank_name;

    @Column(name = "Username")
    private String username;


    /*@OneToOne(mappedBy = "creditCard")
    private User user;
     */


}
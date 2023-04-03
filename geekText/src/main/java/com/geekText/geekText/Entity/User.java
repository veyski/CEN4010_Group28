package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "User_DB")


@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    public String getUsername(){
        return username;
    }

   /*@OneToOne(cascade = CascadeType.ALL)
   @JoinColumn (name = "credit_card_number_fk")
   private CreditCard creditCard;
   */
}
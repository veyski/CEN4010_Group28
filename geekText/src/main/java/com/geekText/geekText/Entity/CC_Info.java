package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "CC_Info")
@NoArgsConstructor
@AllArgsConstructor
public class CC_Info {

    @Id
    @Column(name = "CC ID")
    @GeneratedValue
    private int CC_ID;


    @Column(name = "CC Number")
    private String CC_Number;

    @Column(name = "Expiration Date")
    private String ExpirationDate;

    @Column(name = "CVV")
    private int CVV;

    @Column(name = "Billing Address")
    private String BillingAddress;


}
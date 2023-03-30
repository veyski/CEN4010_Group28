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
    @Column(name = "CC_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CC_ID;


    @Column(name = "CC_Number")
    private String CC_Number;

    @Column(name = "ExpirationDate")
    private String ExpirationDate;

    @Column(name = "CVV")
    private int CVV;

    @Column(name = "BillingAddress")
    private String BillingAddress;


}
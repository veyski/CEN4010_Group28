package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "UserID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int UserID;


    @Column(name = "Username")
    private String Username;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Name")
    private String Name;

    @Column(name = "e-Mail")
    private String eMail;

    @Column(name = "Address")
    private String Address;

}
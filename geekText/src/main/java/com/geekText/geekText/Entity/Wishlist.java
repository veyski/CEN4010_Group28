package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Wishlist")
@NoArgsConstructor
@AllArgsConstructor
public class Wishlist{

    @Id
    @Column(name = "ListID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ListID;

    @Column(name = "UserID")
    private int UserID;

    @Column(name = "BookID")
    private int BookID;

    @Column(name = "ListName")
    private String ListName;

}

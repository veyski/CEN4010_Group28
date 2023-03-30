package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Category")
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @Column(name = "CategoryID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CategoryID;


    @Column(name = "Category")
    private String Category;


}
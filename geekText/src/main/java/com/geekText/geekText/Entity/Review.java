package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Review")
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @Column(name = "ReviewID")
    @GeneratedValue
    private int ReviewID;


    @Column(name = "Content")
    private String Content;

    @Column(name = "Rating")
    private int Rating;


}
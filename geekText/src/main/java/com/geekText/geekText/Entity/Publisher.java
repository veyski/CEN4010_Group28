package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Publisher")
@NoArgsConstructor
@AllArgsConstructor
public class Publisher{

    @Id
    @Column(name = "PublisherID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PublisherID;

    @Column(name = "PublisherName")
    private String PublisherName;


}

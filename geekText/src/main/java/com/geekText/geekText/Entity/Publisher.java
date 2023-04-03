package com.geekText.geekText.Entity;

import java.util.*;
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
    private int publisherId;

    @Column(name = "Publisher")
    private String publisher;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;


}

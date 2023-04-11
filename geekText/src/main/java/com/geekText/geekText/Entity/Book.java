package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Data
@Table(name = "Book")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BookID")
    private int bookId;

    @Column(name = "AuthorID")
    private int authorId;

    @Column(name = "CategoryID")
    private int categoryId;

    @ManyToOne
    @JoinColumn (name = "PublisherID")
    private Publisher publisher;

    @Column(name = "book")
    private String book;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private Float price;

    @Column(name = "publishdate")
    private String publishDate;

    @Column(name = "ISBN")
    private BigInteger isbn;

    @Column(name = "soldcopies")
    private int soldCopies;

    @Column(name = "rating")
    private double rating;

}



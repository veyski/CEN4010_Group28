package com.geekText.geekText.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String authorId;

    @Column(name = "CategoryID")
    private String categoryId;

    @Column(name = "book")
    private String book;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private Float price;

    @Column(name = "publishdate")
    private String publishDate;

    @Column(name = "ISBN")
    private Integer isbn;

    @Column(name = "soldcopies")
    private int soldCopies;

}


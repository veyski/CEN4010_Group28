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
    @Column(name = "BookID")
    @GeneratedValue
    private int BookID;


    @Column(name = "Author")
    private String Author;

    @Column(name = "Category")
    private String Category;

    @Column(name = "Title")
    private String Title;

    @Column(name = "Description")
    private String Description;

    @Column(name = "Price")
    private float Price;

    @Column(name = "Publication Date")
    private String PublishDate;

    @Column(name = "ISBN")
    private int ISBN;

    @Column(name = "Copies Sold")
    private int SoldCopies;

}

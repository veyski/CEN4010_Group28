package com.geekText.geekText.Entity;

import java.util.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @OneToMany(mappedBy = "publisherId", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Book> books;

}

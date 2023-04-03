package com.geekText.geekText.Repository;
import java.util.*;

import com.geekText.geekText.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    List<Book> findByGenre(String genre);
    List<Book> findByRating(int rating);
    List<Book> findByPublisher(String publisher);
}

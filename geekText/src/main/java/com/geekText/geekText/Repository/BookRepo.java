package com.geekText.geekText.Repository;
import java.util.*;

import com.geekText.geekText.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {


    @Query("SELECT b FROM Book b JOIN Category c ON b.categoryId = c.CategoryID WHERE c.Category = :Category")
    List<Book> findByCategory(@Param("Category") String Category);

    @Query("SELECT b FROM Book b JOIN Publisher c ON b.publisherId = c.publisherId WHERE c.publisher = :publisher")
    List<Book> findByPublisher(@Param("publisher") String publisher);

    @Query("SELECT b FROM Book b WHERE b.rating >= :rating")
    List<Book> findByRatingGreaterThanEqual(@Param("rating") Double rating);

}


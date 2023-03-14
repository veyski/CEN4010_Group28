package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public Book saveDetails(Book book){

        return bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

}

package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/addBook")
    public Book postDetails(@RequestBody Book book) {
        return bookService.saveDetails(book);

    }

    @GetMapping ("/getBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
}

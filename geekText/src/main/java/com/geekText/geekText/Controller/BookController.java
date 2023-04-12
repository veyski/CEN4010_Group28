package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Service.PublisherService;
import com.geekText.geekText.Service.BookService;
import com.geekText.geekText.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {

    private final BookService bookService;
    private final PublisherService publisherService;

    private final BookRepo bookRepo;

    @Autowired
    public BookController(BookService bookService, PublisherService publisherService, BookRepo bookRepo) {
        this.bookService = bookService;
        this.publisherService = publisherService;
        this.bookRepo = bookRepo;
    }

    @PostMapping("/addBook")
    public Book postDetails(@RequestBody Book book) {
        return bookService.saveDetails(book);
    }

    @GetMapping("/getBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/getTopSellers")
    public List<Book> getTopSellers() {
        return bookService.getTopSellers(10);
    }

    @GetMapping("/getBooksByCategory/{Category}")
    public List<Book> getBooksByCategory(@PathVariable String Category) {
        return bookService.getBooksByCategory(Category);
    }

    @GetMapping("/getBooksByRating/{rating}")
    public List<Book> getBooksByRating(@PathVariable Double rating) {
        return bookService.getBooksByRating(rating);
    }

}

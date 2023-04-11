package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Service.BookService;
import com.geekText.geekText.Repository.BookRepo;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }



    @PostMapping("/addBook")
    public Book postDetails(@RequestBody Book book) {
        return bookService.saveDetails(book);

    }

    @GetMapping ("/getBooks")
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

package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Service.PublisherService;
import com.geekText.geekText.Service.BookService;
import com.geekText.geekText.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.constant.Constable;
import java.text.DecimalFormat;
import java.math.RoundingMode;
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

    @GetMapping("/getBooksByPublisher/{publisher}")
    public List<Book> getBooksByPublisher(@PathVariable String publisher) {
        return bookService.getBooksByPublisher(publisher);
    }

    @GetMapping("/getBooksByRating/{rating}")
    public List<Book> getBooksByRating(@PathVariable Double rating) {
        return bookService.getBooksByRating(rating);
    }

    @PatchMapping("/publishers/{publisher}/discount")
    public Constable discountBooksByPublisher(@PathVariable String publisher, @RequestParam("discount") float discount) {
        List<Book> books = bookService.getBooksByPublisher(publisher);
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        for (Book book : books) {
            float newPrice = book.getPrice() * (1 - (discount / 100));
            String formattedPrice = df.format(newPrice);
            book.setPrice(Float.parseFloat(formattedPrice));
            bookService.saveDetails(book);
        }
        return "Successfully discounted " + publisher + " books by " + discount + "%.";
    }
}

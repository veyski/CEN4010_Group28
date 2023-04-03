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
    @GetMapping("/getTopSellers")
    public List<Book> getTopSellers() {
        return bookService.getTopSellers(10);
    }

    @GetMapping("/getBooksByGenre/{genre}")
    public List<Book> getBooksByGenre(@PathVariable String genre) {
        return bookService.getBooksByGenre(genre);
    }

    @GetMapping("/getBooksByRating/{rating}")
    public List<Book> getBooksByRating(@PathVariable int rating) {
        return bookService.getBooksByRating(rating);
    }

    @PutMapping("/discountBooks/{publisher}/{discount}")
    public ResponseEntity<?> discountBooksByPublisher(@PathVariable String publisher, @PathVariable double discount) {
        List<Book> books = bookService.getBooksByPublisher(publisher);

        if (books.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        for (Book book : books) {
            double newPrice = book.getPrice() * (1 - (discount / 100));
            book.setPrice((float) newPrice);
            bookService.saveDetails(book);
        }

        return ResponseEntity.ok().build();
    }
}

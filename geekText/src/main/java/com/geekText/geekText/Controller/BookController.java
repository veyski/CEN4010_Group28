package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Publisher;
import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Service.PublisherService;
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
    private final PublisherService publisherService;

    @Autowired
    public BookController(BookService bookService, PublisherService publisherService) {
        this.bookService = bookService;
        this.publisherService = publisherService;
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

    @PatchMapping("/discountByPublisher/{publisher}/{discount}")
    public ResponseEntity<String> discountByPublisher(@PathVariable String publisher, @PathVariable Double discount) {
        Publisher publisherObj = publisherService.getPublisherByName(publisher);
        if (publisherObj == null) {
            return ResponseEntity.badRequest().body("Publisher " + publisher + " not found.");
        }
        List<Book> booksToUpdate = bookService.getBooksByPublisherId((long) publisherObj.getId());
        if (booksToUpdate.isEmpty()) {
            return ResponseEntity.badRequest().body("No books found for publisher " + publisher);
        }
        for (Book book : booksToUpdate) {
            Double currentPrice = Double.valueOf(book.getPrice());
            double discountedPrice = currentPrice - (currentPrice * (discount / 100));
            book.setPrice((float) discountedPrice);
            bookService.saveDetails(book);
        }
        return ResponseEntity.ok().body("Discounted " + booksToUpdate.size() + " books by " + discount + "%");
    }
}

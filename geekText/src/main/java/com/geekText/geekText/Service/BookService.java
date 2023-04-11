package com.geekText.geekText.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Repository.BookRepo;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public List<Book> getTopSellers(int limit) {
        Sort sort = Sort.by(Sort.Direction.DESC, "soldCopies");
        return bookRepo.findAll(sort).stream().limit(limit).collect(Collectors.toList());
    }

    public Book saveDetails(Book book) {
        return bookRepo.save(book);
    }

    public List<Book> getBooksByCategory(String Category) {
        return bookRepo.findByCategoryName(Category);
    }



}

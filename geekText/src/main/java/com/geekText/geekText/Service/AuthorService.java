package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Author;
import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorService(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    public List<Author> getAllAuthors() {
        return authorRepo.findAll();
    }

    public Author saveDetails(Author author){

        return authorRepo.save(author);
    }
}

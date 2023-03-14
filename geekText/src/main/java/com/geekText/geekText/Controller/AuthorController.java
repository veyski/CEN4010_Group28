package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Author;
import com.geekText.geekText.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    // addAuthor adds an object to the author table
    @PostMapping("/addAuthor")
    public Author postDetails(@RequestBody Author author) {
        if(author.getAuthorName() == null){
            System.out.println("Invalid Author name");
        }
        return authorService.saveDetails(author);

    }

    // getAuthor returns a list of objects in the author table
    @GetMapping("/getAuthors")
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

}

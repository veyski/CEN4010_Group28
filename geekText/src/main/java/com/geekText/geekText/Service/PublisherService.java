package com.geekText.geekText.Service;
import jakarta.persistence.EntityNotFoundException;
import com.geekText.geekText.Entity.Book;
import com.geekText.geekText.Entity.Publisher;
import com.geekText.geekText.Repository.BookRepo;
import com.geekText.geekText.Repository.PublisherRepo;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PublisherService {

    private final PublisherRepo publisherRepo;
    private final BookRepo bookRepo;

    public PublisherService(PublisherRepo publisherRepo, BookRepo bookRepo) {
        this.publisherRepo = publisherRepo;
        this.bookRepo = bookRepo;
    }

    public List<Publisher> getAllPublishers() {
        return publisherRepo.findAll();
    }

    public Publisher saveDetails(Publisher publisher){

        return publisherRepo.save(publisher);
    }

    public Publisher getPublisherByName(String publisher) {
        return publisherRepo.findByPublisher(publisher)
                .orElseThrow(() -> new EntityNotFoundException("Publisher not found with name: " + publisher));
    }

}

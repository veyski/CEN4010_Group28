package com.geekText.geekText.Service;
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


}

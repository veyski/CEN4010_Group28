package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Publisher;
import com.geekText.geekText.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class PublisherController {

    @Autowired
    private PublisherService publisherService;


    @PostMapping("/addPublisher")
    public Publisher postDetails(@RequestBody Publisher publisher) {

        return publisherService.saveDetails(publisher);

    }

}

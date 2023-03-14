package com.geekText.geekText.Controller;

import com.geekText.geekText.Entity.Review;
import com.geekText.geekText.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;


    @PostMapping("/addReview")
    public Review postDetails(@RequestBody Review review) {
        return reviewService.saveDetails(review);

    }

}

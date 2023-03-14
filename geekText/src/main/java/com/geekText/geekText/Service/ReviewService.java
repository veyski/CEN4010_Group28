package com.geekText.geekText.Service;

import com.geekText.geekText.Entity.Review;
import com.geekText.geekText.Repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    public Review saveDetails(Review review){

        return reviewRepo.save(review);
    }
}
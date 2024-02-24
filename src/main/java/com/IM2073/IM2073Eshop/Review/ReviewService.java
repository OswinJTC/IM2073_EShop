package com.IM2073.IM2073Eshop.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {


    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> allReviews(){
        return reviewRepository.findAll();
    }

    public Review addReview(Review newReview){

        return reviewRepository.save(newReview);
    }





}

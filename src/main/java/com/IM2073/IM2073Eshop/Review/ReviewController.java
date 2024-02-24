package com.IM2073.IM2073Eshop.Review;

import com.IM2073.IM2073Eshop.Product.Product;
import com.IM2073.IM2073Eshop.Product.ProductService;
import com.IM2073.IM2073Eshop.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/reviewApi")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;
    @Autowired
    private ProductService productService;

    @GetMapping ("/allReviews")
    public List<Review> getAllReviews(){
        return reviewService.allReviews();
    }

    @PostMapping("/addReview")
    public ResponseEntity<String> addSingleReview(@RequestBody Review newReview){
        if(newReview != null
                && !StringUtils.isEmpty(newReview.getAuthor())
                && !StringUtils.isEmpty(newReview.getBody())
        ){

            reviewService.addReview(newReview);
            return new ResponseEntity<>("Review added successfully", HttpStatus.CREATED);

        }else{

            return new ResponseEntity<>("Post failed", HttpStatus.UNAUTHORIZED);

        }

    }





}

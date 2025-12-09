package com.example.UberReviewService.Service;


import com.example.UberReviewService.Model.Booking;
import com.example.UberReviewService.Model.Review;
import com.example.UberReviewService.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;



import java.util.Date;
import java.util.List;
import java.util.Properties;

@Repository
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository=reviewRepository;
    }

    @Override
    public void run(String... args)throws  Exception{
        System.out.println("***********");
        Review r= Review.builder()
                .content("Amazon ride quality")
                .rating(5.0)
                .build();

        Booking b= Booking
                .builder()
                .review(r)
                .endTime(new Date())
                .build();

        reviewRepository.save(r);

        System.out.println(r);


        List<Review> reviews=reviewRepository.findAll();

        for(Review review:reviews){
            System.out.println(r.getContent());
        }
    }

}

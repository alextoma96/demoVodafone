package com.example.demo.vodafone.controller;

import com.example.demo.vodafone.dao.Rating;
import com.example.demo.vodafone.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    RatingService ratingService;

    @GetMapping("/rating")
    private List<Rating> getAllRating() {
        return ratingService.getAllRating();
    }

    @PostMapping("/rating")
    private int saveRating(@RequestBody Rating rating) {
        ratingService.saveOrUpdate(rating);

        return rating.getId();
    }


}

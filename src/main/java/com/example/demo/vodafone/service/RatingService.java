package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Rating;
import com.example.demo.vodafone.repository.PostareRepository;
import com.example.demo.vodafone.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;
    private final PostareRepository postareRepository;

    public RatingService(RatingRepository ratingRepository, PostareRepository postareRepository) {
        this.ratingRepository = ratingRepository;
        this.postareRepository = postareRepository;
    }


    public List<Rating> getAllRating() {
        List<Rating> ratings = new ArrayList<Rating>();
        ratingRepository.findAll().forEach(ratings::add);

        return ratings;
    }

    public Rating getRatingById(int id) {
        return getRatingById(id);
    }

    public void saveOrUpdate(Rating rating) {
        ratingRepository.save(rating);
    }

    public void delete(int id) {
        ratingRepository.deleteById(id);
    }
}

package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Rating;
import com.example.demo.vodafone.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RatingService {

    private final RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }


    public List<Rating> getAllRating() {
        List<Rating> ratings = new ArrayList<Rating>();
        ratingRepository.findAll().forEach(ratings::add);

        return ratings;
    }
    
    public List<Rating> getAllRatingsByPostare(int idPostare){
        return getAllRating().stream().filter(rating -> rating.getIdPostare() == idPostare).collect(Collectors.toList());
    }

    public void saveOrUpdate(Rating rating) {
        ratingRepository.save(rating);
    }

    public void delete(int id) {
        ratingRepository.deleteById(id);
    }
}

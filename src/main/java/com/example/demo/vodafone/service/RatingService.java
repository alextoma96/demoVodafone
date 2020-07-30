package com.example.demo.vodafone.service;

import com.example.demo.vodafone.dao.Postare;
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


    public List<Rating> getAllRating()
    {
        List<Rating> ratings = new ArrayList<Rating>();
        ratingRepository.findAll().forEach(ratings::add);

        return ratings;
    }

    public Rating getRatingById(int id)
    {
        return getRatingById(id);
    }

    public void saveOrUpdate(Rating rating)
    {
        Postare postare = new Postare();
        ratingRepository.save(rating);
        postare = postareRepository.findById(rating.getId_postare()).get();
        postare.setRating((postare.getRating()+rating.getNota())/2);
        postareRepository.save(postare);
    }

    public void delete(int id)
    {
        ratingRepository.deleteById(id);
    }
}

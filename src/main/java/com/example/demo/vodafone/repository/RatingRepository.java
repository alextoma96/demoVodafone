package com.example.demo.vodafone.repository;

import com.example.demo.vodafone.dao.Rating;
import org.springframework.data.repository.CrudRepository;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
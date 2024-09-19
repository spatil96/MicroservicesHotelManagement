package com.pracise.RatingService.RatingService.serviceImpl;

import com.pracise.RatingService.RatingService.entities.Rating;
import com.pracise.RatingService.RatingService.repository.RatingRepo;
import com.pracise.RatingService.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public List<Rating> getAll() {
        return ratingRepo.findAll();
    }

    @Override
    public Rating create(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getRatingByUserId(String Id) {
        return ratingRepo.findByUserId(Id);
    }

    @Override
    public List<Rating> getRatingByHotelId(String Id) {
        return ratingRepo.findByHotelId(Id);
    }
}

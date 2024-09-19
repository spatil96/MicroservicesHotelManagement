package com.pracise.RatingService.RatingService.service;

import com.pracise.RatingService.RatingService.entities.Rating;


import java.util.List;

public interface RatingService {

    List<Rating> getAll();
    Rating create(Rating rating);
    List<Rating> getRatingByUserId(String Id);
    List<Rating> getRatingByHotelId(String Id);
}

package com.pracise.RatingService.RatingService.contoller;

import com.pracise.RatingService.RatingService.entities.Rating;
import com.pracise.RatingService.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAll());
    }

    @GetMapping("/users/{Id}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String Id){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByUserId(Id));
    }
    @GetMapping("/hotel/{Id}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String Id){
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getRatingByHotelId(Id));
    }
}

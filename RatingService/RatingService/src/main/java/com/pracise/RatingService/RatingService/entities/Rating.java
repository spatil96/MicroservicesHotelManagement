package com.pracise.RatingService.RatingService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("user_Ratings")
public class Rating {
    @Id
    private String ratingID;
    private String userId;
    private String hotelId;
    private String  feedback;
    private int rating;
}

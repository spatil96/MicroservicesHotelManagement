package com.practise.userService.UserService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    private String ratingID;
    private String userId;
    private String hotelId;
    private String  feedback;
    private int rating;

    private Hotel hotel;
}

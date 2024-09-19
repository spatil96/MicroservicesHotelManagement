package com.practise.userService.UserService.services;

import com.practise.userService.UserService.entities.User;

import java.util.List;

public interface UserService {

    List<User> getUser();
    User saveuser(User user);
    User getUser(String userID);
    //Make for update
    //make for delete

}

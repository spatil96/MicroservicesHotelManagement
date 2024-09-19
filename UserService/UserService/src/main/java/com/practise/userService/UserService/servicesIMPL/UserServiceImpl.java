package com.practise.userService.UserService.servicesIMPL;

import com.practise.userService.UserService.entities.Rating;
import com.practise.userService.UserService.entities.User;
import com.practise.userService.UserService.exceptions.ResourceNotFoundException;
import com.practise.userService.UserService.repositories.UserRepository;
import com.practise.userService.UserService.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger =  LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }

    @Override
    public User saveuser(User user) {
        String userID = UUID.randomUUID().toString();
        user.setID(userID);
        System.out.println(user.toString());
        return userRepository.save(user);
    }

    @Override
    public User getUser(String userID) {
        User user =  userRepository.findById(userID).orElseThrow(() ->
                new ResourceNotFoundException("user with given id not found"+ userID));
        ArrayList<Rating> ratingOfUser = restTemplate.getForObject("http://localhost:8083/rating/" +user.getID(), ArrayList.class);
        logger.info("{}",ratingOfUser);

        user.setRatings(ratingOfUser);
        return user;
    }
}

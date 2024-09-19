package com.practise.userService.UserService.repositories;

import com.practise.userService.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    //implement method or query this helps

}

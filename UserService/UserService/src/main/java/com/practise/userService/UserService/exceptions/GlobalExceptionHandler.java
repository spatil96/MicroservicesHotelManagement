package com.practise.userService.UserService.exceptions;

import com.practise.userService.UserService.payload.ApiResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResource> handlerResourceNotFoundException(ResourceNotFoundException ex){
        String message = ex.getMessage();
       ApiResource build =  ApiResource.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
       return new ResponseEntity<ApiResource>(build, HttpStatus.NOT_FOUND);
    }
}

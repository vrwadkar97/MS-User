package com.user.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(User_Already_Present.class)
    public ResponseEntity<?> getException(User_Already_Present present){
        return new ResponseEntity<>("User with entered id already present", HttpStatus.OK);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(User_Not_Found.class)
    public ResponseEntity<?> getException2(User_Not_Found not_found){
        return new ResponseEntity<>("User with entered id is not found", HttpStatus.NOT_FOUND);
    }
}

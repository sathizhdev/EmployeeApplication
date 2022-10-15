package com.example.employee.Exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UserNotFoundException extends ResponseStatusException {


    public UserNotFoundException(String message){
        super(HttpStatus.NOT_FOUND, message);
    }

    @Override
    public HttpHeaders getResponseHeaders() {
        return new HttpHeaders();
    }

}

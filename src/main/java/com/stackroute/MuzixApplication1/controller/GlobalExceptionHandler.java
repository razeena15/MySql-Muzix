package com.stackroute.MuzixApplication1.controller;

import com.stackroute.MuzixApplication1.exception.TrackAlreadltExistsException;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice

public class GlobalExceptionHandler
{


    @ResponseStatus(value= HttpStatus.CONFLICT, reason="track already exists")
    @ExceptionHandler(TrackAlreadltExistsException.class)

    public void handleTrackAlreadyExistsException(TrackAlreadltExistsException e){
        System.out.println("track alreday hai pehle si hai");
        System.out.println("trackkkkkk already exists");
    }
}


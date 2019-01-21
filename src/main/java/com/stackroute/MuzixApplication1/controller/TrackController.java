package com.stackroute.MuzixApplication1.controller;


import com.stackroute.MuzixApplication1.domain.Track;
import com.stackroute.MuzixApplication1.exception.TrackAlreadltExistsException;
import com.stackroute.MuzixApplication1.service.TrackService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class TrackController
{

    private TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("track")
    public ResponseEntity<?> getAllTracks()
    {
        return new ResponseEntity<List<Track>>(trackService.getAllTracks(), HttpStatus.OK);
    }



    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) throws TrackAlreadltExistsException
    {

        ResponseEntity responseEntity;
        trackService.saveTrack(track);
        responseEntity = new ResponseEntity<Track>(track, HttpStatus.CREATED);
//        try {
//            trackService.saveTrack(track);//call to savetrack passing the track object received from
//            responseEntity = new ResponseEntity<Track>(track, HttpStatus.CREATED);
//
//            return responseEntity;
//
//        } catch (Exception exception)
//        {
//            responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
//        }
        return  responseEntity;
    }

    @PutMapping("track")
    public ResponseEntity<?> updateTrack(@RequestBody Track track)

    {
        ResponseEntity responseEntity;
        try {
            trackService.updateTrack(track);
            responseEntity = new ResponseEntity<String>("updated successfully", HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteTrack(@PathVariable("id") int id)
    {

        ResponseEntity responseEntity;
        try {
            trackService.deleteTrack(id);//call to savetrack passing the track object received from
            responseEntity = new ResponseEntity<String>("deleted successfully", HttpStatus.CREATED);

            return responseEntity;

        } catch (Exception exception)
        {
            responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
        }
        return  responseEntity;
    }





}

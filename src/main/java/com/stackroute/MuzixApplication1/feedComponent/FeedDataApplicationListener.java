package com.stackroute.MuzixApplication1.feedComponent;


import com.stackroute.MuzixApplication1.domain.Track;
import com.stackroute.MuzixApplication1.exception.TrackAlreadltExistsException;
import com.stackroute.MuzixApplication1.service.TrackService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;



@Component
@Data
@Primary

public class FeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    Environment env;

    @Autowired
    TrackService trackServices;
    Track feedTrackData = new Track();
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event)
    {
//
//        feedTrackData.setId(Integer.parseInt(env.getProperty("song.1.id")));
//        feedTrackData.setName(env.getProperty("song.1.name"));
//        feedTrackData.setComment(env.getProperty("song.1.comment"));
//        try {
//            trackServices.saveTrack(feedTrackData);
//        } catch (TrackAlreadltExistsException e) {
//            e.printStackTrace();
//        }
//
//        feedTrackData.setId(Integer.parseInt(env.getProperty("song.2.id")));
//        feedTrackData.setName(env.getProperty("song.2.name"));
//        feedTrackData.setComment(env.getProperty("song.2.comment"));
//
//        try {
//            trackServices.saveTrack(feedTrackData);
//        } catch (TrackAlreadltExistsException e) {
//            e.printStackTrace();
//        }
//
//        feedTrackData.setId(Integer.parseInt(env.getProperty("song.3.id")));
//        feedTrackData.setName(env.getProperty("song.3.name"));
//        feedTrackData.setComment(env.getProperty("song.3.comment"));
//
//        try {
//            trackServices.saveTrack(feedTrackData);
//        } catch (TrackAlreadltExistsException e) {
//            e.printStackTrace();
//        }


    }
}

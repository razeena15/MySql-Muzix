package com.stackroute.MuzixApplication1.service;

import com.stackroute.MuzixApplication1.domain.Track;
import com.stackroute.MuzixApplication1.exception.TrackAlreadltExistsException;
import com.stackroute.MuzixApplication1.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrackServiceImpl implements TrackService {


    TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track updateTrack(Track track) {
        Track updatedTrack = trackRepository.save(track);
        return updatedTrack;
    }

    @Override

    public boolean deleteTrack(int id) {

        trackRepository.deleteById(id);
        return true;
    }


    @Override
    public Track saveTrack(Track track) throws TrackAlreadltExistsException {
        if (trackRepository.existsById(track.getId())) {
            throw new TrackAlreadltExistsException("TRACK ALREADY EXISTS");
        }

     //   Track savedTrack = trackRepository.save(track);
//
//        if (savedTrack == null)
//        {
//            throw new TrackAlreadltExistsException("plz......  add any track");
//        }
        else
            {
        return trackRepository.save(track);
            }
    }

    @Override
    public List<Track> getAllTracks()
    {
     return trackRepository.findAll();
    }
}


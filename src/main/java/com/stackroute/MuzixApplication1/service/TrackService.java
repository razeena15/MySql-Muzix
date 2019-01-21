package com.stackroute.MuzixApplication1.service;
 import com.stackroute.MuzixApplication1.domain.Track;
 import com.stackroute.MuzixApplication1.exception.TrackAlreadltExistsException;
 import com.stackroute.MuzixApplication1.exception.TrackNotFoundException;
import com.stackroute.MuzixApplication1.exception.*;
 import java.util.List;

public interface TrackService
{
    public Track saveTrack(Track track) throws TrackAlreadltExistsException; //tracks ADDED

    public List<Track> getAllTracks();  ///RETRIEVE TRACKS

    public boolean deleteTrack(int id) throws TrackNotFoundException;//delete track

    public Track updateTrack(Track track);

}

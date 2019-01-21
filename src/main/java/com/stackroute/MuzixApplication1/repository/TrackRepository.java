package com.stackroute.MuzixApplication1.repository;

import com.stackroute.MuzixApplication1.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrackRepository extends JpaRepository<Track,Integer>
{


}

package com.cricket.RunRadarBackend.service;

import com.cricket.RunRadarBackend.entities.Match;

import java.util.List;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();

}

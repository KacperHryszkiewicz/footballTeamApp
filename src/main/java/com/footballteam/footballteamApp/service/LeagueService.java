package com.footballteam.footballteamApp.service;

import com.footballteam.footballteamApp.entity.LeagueEntity;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    public LeagueEntity getById(Long id){
        return new LeagueEntity(1l,"A");
    }
}

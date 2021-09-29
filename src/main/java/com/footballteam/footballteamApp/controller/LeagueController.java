package com.footballteam.footballteamApp.controller;

import com.footballteam.footballteamApp.dto.League;
import com.footballteam.footballteamApp.mapper.LeagueMapper;
import com.footballteam.footballteamApp.service.LeagueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/league")
@RequiredArgsConstructor
public class LeagueController {

    private final LeagueService leagueService;

    private final LeagueMapper leagueMapper;

    @GetMapping(path = "/{id}")
    public League getById(@PathVariable Long id){
        return  leagueMapper.toDTO2(leagueService.getById(id));
    }
}

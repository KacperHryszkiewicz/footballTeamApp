package com.footballteam.footballteamApp.mapper;

import com.footballteam.footballteamApp.dto.League;
import com.footballteam.footballteamApp.entity.LeagueEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")// dzieki temu klasa ta jest komponentem springowym
public abstract class LeagueMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(source = "name", target = "name")//automatycznie po nazwie
    abstract League toDTO(LeagueEntity entity);

    abstract LeagueEntity toEntity(League dto);

    public League toDTO2(LeagueEntity entity) {
        return League.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}

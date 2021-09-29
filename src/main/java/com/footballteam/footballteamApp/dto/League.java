package com.footballteam.footballteamApp.dto;

import lombok.Builder;
import lombok.Data;

@Data//Data = : A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields, and @RequiredArgsConstructor! https://projectlombok.org/features/Data?fbclid=IwAR1-xXgPnO3Haj-UOAqLf3kXkQ96DkRgcSvQjinmZzLhKj48z4Q589wxju4
@Builder
public class League {

    private Long id;

    private String name;

}

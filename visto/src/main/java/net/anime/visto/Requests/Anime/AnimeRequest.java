package net.anime.visto.Requests.Anime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class AnimeRequest {

    private String id;

    private String name;

    private Integer currentEpisode;

    private Boolean finished;

    private Date startDate;

    private Date endDate;

    private Integer numberOfEpisodes;

    private Integer numberOfViewings;

    private Date releaseDate;

    private Date registrationDate;

    private Double rating;

    private String description;
}


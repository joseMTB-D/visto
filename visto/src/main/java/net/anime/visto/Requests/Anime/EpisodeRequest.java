package net.anime.visto.Requests.Anime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
public class EpisodeRequest {

    private String animeId;

    private String id;

    private Integer episodeNumber;

    private Time duration;

    private String video;

}

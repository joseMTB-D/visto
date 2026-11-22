package net.anime.visto.Models.Service.Anime;

import jakarta.persistence.*;
import jdk.jfr.Timespan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "episode")
public class Episode {

    String animeId;

    @Id
    String id;

    Integer episodeNumber;

    @Timespan
    Time duration;

    String video;

}

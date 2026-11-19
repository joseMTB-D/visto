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
@Table(name = "episodio")
public class Episodio {

    String animeId;

    @Id
    String id;

    Integer numeroEpisodio;

    @Timespan
    Time duracion;

    String video;

}

package net.anime.visto.Models.Service.Anime;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "animes")
public class Anime {

    @Id

    String id = UUID.randomUUID().toString();

    String name;

    Integer currentEpisode;

    Boolean finished;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date startDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date endDate;

    Integer numberOfEpisodes;

    Integer numberOfViewings;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date releaseDate;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date registrationDate;

    Double rating;

    String description;

}

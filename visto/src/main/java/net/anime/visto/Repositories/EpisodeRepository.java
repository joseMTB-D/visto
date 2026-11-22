package net.anime.visto.Repositories;

import net.anime.visto.Models.Service.Anime.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode, String> {

}

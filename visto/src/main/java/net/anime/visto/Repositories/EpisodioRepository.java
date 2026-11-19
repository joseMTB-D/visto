package net.anime.visto.Repositories;

import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodioRepository extends JpaRepository<Episodio, String> {

}

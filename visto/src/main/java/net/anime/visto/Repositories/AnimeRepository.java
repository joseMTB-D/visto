package net.anime.visto.Repositories;

import net.anime.visto.Models.Service.Anime.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnimeRepository extends JpaRepository<Anime, String> {

    Optional<Anime> findByName(String name);
}

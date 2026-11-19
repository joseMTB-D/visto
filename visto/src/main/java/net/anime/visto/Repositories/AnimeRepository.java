package net.anime.visto.Repositories;

import lombok.NoArgsConstructor;
import net.anime.visto.Models.Service.Anime.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface AnimeRepository extends JpaRepository<Anime, String> {

    Optional<Anime> findByNombre(String nombre);
}

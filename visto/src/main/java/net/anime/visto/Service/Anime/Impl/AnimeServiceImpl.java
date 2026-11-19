package net.anime.visto.Service.Anime.Impl;

import jakarta.persistence.OptimisticLockException;
import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episodio;
import net.anime.visto.Repositories.AnimeRepository;
import net.anime.visto.Repositories.EpisodioRepository;
import net.anime.visto.Service.Anime.AnimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class AnimeServiceImpl implements AnimeService {

    Logger log = LoggerFactory.getLogger(AnimeServiceImpl.class);

    private final AnimeRepository animeRepository;
    private final EpisodioRepository episodioRepository;

    public AnimeServiceImpl(AnimeRepository animeRepository, EpisodioRepository episodioRepository) {
        this.animeRepository = animeRepository;
        this.episodioRepository = episodioRepository;
    }


    //TODO Crear en su propia interfaz de seguridad
    //public String login();

    @Override
    public String addAnime(Anime anime) {
        try{
            animeRepository.save(anime);
            System.out.println("[AnimeServiceImpl-añadirAnime]: Anime añadido correctamente: " + anime.getNombre());
            log.info("[AnimeServiceImpl-añadirAnime]: Anime añadido correctamente: {}", anime.getNombre());
        }catch(OptimisticLockException e){
            System.out.println("[AnimeServiceImpl-añadirAnime]: ERROR al añadir el anime: " + e.getMessage());
            log.error("[AnimeServiceImpl-añadirAnime]: ERROR al añadir el anime: {}", e.getMessage());
            return "ERROR: " + e.getMessage();
        }
        return "OK";
    }


    @Override
    public String updateAnime(Anime anime) {
        return "";
    }
    @Override
    public String deleteAnime(Anime anime) {
        return "";
    }

    @Override
    public String addEpisode(Episodio episodio, String animeName) {

        try{
            Anime animeOfEpisode = animeRepository.findByNombre(animeName).orElseThrow(() -> new RuntimeException("Anime no encontrado: " + animeName));
            episodio.setAnimeId(animeOfEpisode.getId());
            episodio.setId(generateEpisodeID(animeName, episodio.getNumeroEpisodio()));
            episodioRepository.save(episodio);
            System.out.println("[AnimeServiceImpl-añadirAnime]: Anime añadido correctamente: " + episodio.getAnimeId());
            log.info("[AnimeServiceImpl-añadirAnime]: Anime añadido correctamente: {}", episodio.getAnimeId());
        }catch(OptimisticLockException e){
            System.out.println("[AnimeServiceImpl-añadirAnime]: ERROR al añadir el anime: " + e.getMessage());
            log.error("[AnimeServiceImpl-añadirAnime]: ERROR al añadir el anime: {}", e.getMessage());
            return "ERROR: " + e.getMessage();
        }
        return "OK";
    }
    /**
     * Genera la ID del capitulo
     * @param animeName
     * @param numeroEpisodio
     * @return
     */
    private String generateEpisodeID(String animeName,Integer numeroEpisodio){
        return animeName + "_" + numeroEpisodio + "_" + UUID.randomUUID().toString();
    }


    @Override
    public String updateEpisode(Episodio episodio) {
        return "";
    }
    @Override
    public String deleteEpisode(Episodio episodio) {
        return "";
    }
}

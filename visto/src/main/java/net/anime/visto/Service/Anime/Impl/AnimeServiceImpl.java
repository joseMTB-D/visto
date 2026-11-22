package net.anime.visto.Service.Anime.Impl;

import jakarta.persistence.OptimisticLockException;
import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episode;
import net.anime.visto.Repositories.AnimeRepository;
import net.anime.visto.Repositories.EpisodeRepository;
import net.anime.visto.Service.Anime.AnimeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Service
public class AnimeServiceImpl implements AnimeService {

    Logger log = LoggerFactory.getLogger(AnimeServiceImpl.class);

    private final AnimeRepository animeRepository;
    private final EpisodeRepository episodeRepository;

    public AnimeServiceImpl(AnimeRepository animeRepository, EpisodeRepository episodeRepository) {
        this.animeRepository = animeRepository;
        this.episodeRepository = episodeRepository;
    }


    //TODO Crear en su propia interfaz de seguridad
    //public String login();

    @Override
    public String addAnime(Anime anime) {
        try{
            animeRepository.save(anime);
            System.out.println("[AnimeServiceImpl-addAnime]: Anime added correctly: " + anime.getName());
            log.info("[AnimeServiceImpl-addAnime]: Anime added correctly: {}", anime.getName());
        }catch(OptimisticLockException e){
            System.out.println("[AnimeServiceImpl-addAnime]: ERROR adding anime: " + e.getMessage());
            log.error("[AnimeServiceImpl-addAnime]: ERROR adding anime: {}", e.getMessage());
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
    public String addEpisode(Episode episode, String animeName) {

        try{
            Anime animeOfEpisode = animeRepository.findByName(animeName).orElseThrow(() -> new RuntimeException("Anime no encontrado: " + animeName));
            episode.setAnimeId(animeOfEpisode.getId());
            episode.setId(generateEpisodeID(animeName, episode.getEpisodeNumber()));
            episodeRepository.save(episode);
            System.out.println("[AnimeServiceImpl-addEpisode]: Episode added correctly: " + episode.getAnimeId());
            log.info("[AnimeServiceImpl-addEpisode]: Episode added correctly: {}", episode.getAnimeId());
        }catch(OptimisticLockException e){
            System.out.println("[AnimeServiceImpl-addEpisode]: ERROR adding episode: " + e.getMessage());
            log.error("[AnimeServiceImpl-addEpisode]: ERROR adding episode: {}", e.getMessage());
            return "ERROR: " + e.getMessage();
        }
        return "OK";
    }
    /**
     * Genera la ID del capitulo
     * @param animeName
     * @param episodeNumber
     * @return
     */
    private String generateEpisodeID(String animeName,Integer episodeNumber) {
        return animeName + "_" + episodeNumber + "_" + UUID.randomUUID().toString();
    }


    @Override
    public String updateEpisode(Episode episode) {
        return "";
    }
    @Override
    public String deleteEpisode(Episode episode) {
        return "";
    }
}

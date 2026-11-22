package net.anime.visto.Service.Anime;

import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episode;

public interface AnimeService {


    //TODO Crear en su propia interfaz de seguridad
    //public String login();

    String addAnime(Anime anime);
    String updateAnime(Anime anime);
    String deleteAnime(Anime anime);

    String addEpisode(Episode episode, String animeName);
    String updateEpisode(Episode episode);
    String deleteEpisode(Episode episode);

}


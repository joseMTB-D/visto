package net.anime.visto.Service.Anime;

import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episodio;

public interface AnimeService {


    //TODO Crear en su propia interfaz de seguridad
    //public String login();

    public String addAnime(Anime anime);
    public String updateAnime(Anime anime);
    public String deleteAnime(Anime anime);

    public String addEpisode(Episodio episodio, String animeName);
    public String updateEpisode(Episodio episodio);
    public String deleteEpisode(Episodio episodio);

}


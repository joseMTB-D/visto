package net.anime.visto.DataBase;

import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episode;

import net.anime.visto.Service.Anime.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class vistoDBTest {

    @Autowired
    private AnimeService animeService;

    private static Anime anime = null;
    private static Episode episode = null;


    private void setUp() {
        anime = new Anime();
        anime.setName("Naruto shippuden");
        anime.setCurrentEpisode(220);
        anime.setFinished(false);
        anime.setRegistrationDate(new java.util.Date());
        anime.setStartDate(new java.util.Date());
        anime.setEndDate(new java.util.Date());
        anime.setReleaseDate(new java.util.Date());
        anime.setRating(9.5);
        anime.setDescription("Anime de ninjas");

        episode = new Episode();
        episode.setAnimeId("dcf6ba27-a741-47ba-a9d4-e4fcff8ed52d");
        episode.setEpisodeNumber(1);
        episode.setDuration(new java.sql.Time(00, 23, 56));
        episode.setVideo(null);
    }



    @Test
    public void TestAddAnime() {
        setUp();
        String resultado = animeService.addAnime(anime);

        assertEquals("OK", resultado, "Anime added correctly");
        assertEquals("Naruto shippuden", anime.getName(), "The name of the anime is correct");
    }
    @Test
    public void TestAddEpisode() {
        setUp();
        String resultado = animeService.addEpisode(episode, "Naruto shippuden");

        assertEquals("OK", resultado, "Episode added correctly");
        assertEquals("Naruto shippuden", anime.getName(), "The name of the anime is correct");
    }



}

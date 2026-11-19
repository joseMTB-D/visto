package net.anime.visto.DataBase;

import net.anime.visto.Models.Service.Anime.Anime;
import net.anime.visto.Models.Service.Anime.Episodio;

import net.anime.visto.Service.Anime.AnimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class vistoDBnTest {

    @Autowired
    private AnimeService animeService;

    private static Anime anime = null;
    private static Episodio episodio = null;


    private void setUp() {
        anime = new Anime();
        anime.setNombre("Naruto shippuden");
        anime.setEpisodioActual(220);
        anime.setFinalizado(false);
        anime.setFechaRegistro(new java.util.Date());
        anime.setFechaInicio(new java.util.Date());
        anime.setFechaFin(new java.util.Date());
        anime.setFechaEstreno(new java.util.Date());
        anime.setNota(9.5);
        anime.setDescripcion("Anime de ninjas");

        episodio = new Episodio();
        episodio.setAnimeId("dcf6ba27-a741-47ba-a9d4-e4fcff8ed52d");
        episodio.setNumeroEpisodio(1);
        episodio.setDuracion(new java.sql.Time(00, 23, 56));
        episodio.setVideo(null);
    }



    @Test
    public void TestAddAnime() {
        setUp();
        String resultado = animeService.addAnime(anime);

        assertEquals("OK", resultado, "El anime no se añadió correctamente");
        assertEquals("Naruto shippuden", anime.getNombre(), "El no nombre del anime es correcto");
    }
    @Test
    public void TestAddEpisodio() {
        setUp();
        String resultado = animeService.addEpisode(episodio, "Naruto shippuden");

        assertEquals("OK", resultado, "El episodio no se añadió correctamente");
        assertEquals("Naruto shippuden", anime.getNombre(), "El no nombre del anime es correcto");
    }



}

package net.anime.visto.Controller;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visto")
public class apiController {


    @PostMapping("/añadirAnime")
    public Response nuevoAnime(

    ) {


        return "¡helloWord!";
    }

    @PutMapping("/modificarAnime")
    public String añadirAnime() {
        return "¡helloWord!";
    }

    @DeleteMapping("/eliminarAnime")
    public String eliminarAnime() {
        return "¡helloWord!";
    }

    @PostMapping("/añadirEpisodio")
    public String añadirEpisodio() {
        return "¡helloWord!";
    }

    @PutMapping("/añadirEpisodio")
    public String modificarEpisodio() {
        return "¡helloWord!";
    }

    @DeleteMapping("/eliminarEpisodio")
    public String eliminarEpisodio() {
        return "¡helloWord!";
    }
}

package net.anime.visto.Controller;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/visto")
public class apiController {


    @PostMapping("/addAnime")
    public Response nuevoAnime() {
        Response response = new Response();

        return response;
    }

    @PutMapping("/updateAnime")
    public String updateAnime() {
        return "¡helloWord!";
    }

    @DeleteMapping("/deleteAnime")
    public String deleteAnime() {
        return "¡helloWord!";
    }

    @PostMapping("/addEpisode")
    public String addEpisode() {
        return "¡helloWord!";
    }

    @PutMapping("/updateEpisode")
    public String updateEpisode() {
        return "¡helloWord!";
    }

    @DeleteMapping("/deleteEpisode")
    public String deleteEpisode() {
        return "¡helloWord!";
    }
}

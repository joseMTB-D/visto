package net.anime.visto.Requests.Anime;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class AnimeRequest {

    private String id;

    private String nombre;

    private Integer episodioActual;

    private Boolean finalizado;

    private Date fechaInicio;

    private Date fechaFin;

    private Integer numeroEpisodios;

    private Integer numeroRevisualizaciones;

    private Date fechaEstreno;

    private Date fechaRegistro;

    private Double nota;

    private String descripcion;
}


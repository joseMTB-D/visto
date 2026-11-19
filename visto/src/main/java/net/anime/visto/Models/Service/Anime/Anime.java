package net.anime.visto.Models.Service.Anime;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "anime")
public class Anime {

    @Id
    String id = UUID.randomUUID().toString();

    String nombre;

    Integer episodioActual;

    Boolean finalizado;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date fechaInicio;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date fechaFin;

    Integer numeroEpisodios;

    Integer numeroRevisualizaciones;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date fechaEstreno;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    Date fechaRegistro;

    Double nota;

    String descripcion;

}

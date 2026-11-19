CREATE TABLE IF NOT EXISTS anime (
    ID varchar(255) primary key NOT NULL,
    NOMBRE varchar(255) not null,
    EPISODIO_ACTUAL int,
    FINALIZADO boolean,
    FECHA_INICIO date,
    FECHA_FIN date,
    NUMERO_EPISODIOS int,
    NUMERO_REVISUALIZACIONES int,
    FECHA_ESTRENO date,
    FECHA_REGISTRO date,
    NOTA double,
    DESCRIPCION text
);

CREATE TABLE IF NOT EXISTS episodio (
    ANIME_ID varchar(255),
    FOREIGN KEY (ANIME_ID) REFERENCES anime(ID),
    ID varchar(255) primary key NOT NULL,
    NUMERO_EPISODIO int,
    DURACION time,
    video text
);

CREATE TABLE IF NOT EXISTS usuarios (
    ID integer primary key NOT NULL auto_increment,
    NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    PASSWORD varchar(255) not null
);
CREATE TABLE IF NOT EXISTS animes (
    ID varchar(255) primary key NOT NULL,
    NAME varchar(255) not null,
    CURRENT_EPISODE int,
    FINISHED boolean,
    START_DATE date,
    END_DATE date,
    NUMBER_OF_EPISODES int,
    NUMBER_OF_VIEWINGS int,
    RELEASE_DATE date,
    REGISTRATION_DATE date,
    RATING double,
    DESCRIPTION text
);

CREATE TABLE IF NOT EXISTS episode (
    ANIME_ID varchar(255),
    FOREIGN KEY (ANIME_ID) REFERENCES animes(ID),
    ID varchar(255) primary key NOT NULL,
    EPISODE_NUMBER int,
    DURATION time,
    VIDEO text
);

CREATE TABLE IF NOT EXISTS usuarios (
    ID integer primary key NOT NULL auto_increment,
    NAME varchar(255) not null,
    EMAIL varchar(255) not null,
    PASSWORD varchar(255) not null
);
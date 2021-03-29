package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.itsjava.domain.Film;
import ru.itsjava.domain.Genre;
import ru.itsjava.domain.Place;
import ru.itsjava.repository.FilmRepository;
import ru.itsjava.repository.FilmRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

//Унаследовать репозиторий FilmRepository в FilmRepositoryImpl
// Проставить аннотации Repository и Transactional
// Реализовать методы save и findById
// Проверить себя с помощью расскоментирования блока в методе main

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) throws SQLException {
        var context = SpringApplication.run(MyApp.class);

        FilmRepository filmRepository = context.getBean(FilmRepository.class);
        Film film = filmRepository.save(new Film(0L, "best film",
                new Genre(0L, "fant"),
                List.of(new Place(0L, "best place", 1L))));

        System.out.println(filmRepository.getById(1L));
//        filmRepository.deleteById(1L);
//        System.out.println(filmRepository.getById(1L) + "after delete");

        film.setGenre(new Genre(0L, "comedy"));
        filmRepository.updateFilm(film);
        System.out.println(filmRepository.getById(1L) + "after update");

    }
}
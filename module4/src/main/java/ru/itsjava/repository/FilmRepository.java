package ru.itsjava.repository;

import ru.itsjava.domain.Film;

import java.util.List;
import java.util.Optional;

public interface FilmRepository {
    Film save(Film film);
    Optional<Film> getById(long id);
    void updateFilm(Film film);
    void deleteById(long id);
}
package ru.itsjava.repository;

import org.springframework.stereotype.Repository;
import ru.itsjava.domain.Film;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface FilmRepository {
    Film save(Film film);
    Optional<Film> getById(long id);
    void updateFilm(Film film);
    void deleteById(long id);
}
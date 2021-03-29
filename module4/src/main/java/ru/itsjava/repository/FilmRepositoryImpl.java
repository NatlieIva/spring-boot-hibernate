package ru.itsjava.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.itsjava.domain.Film;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.Optional;

@Repository
@Transactional
public class FilmRepositoryImpl implements FilmRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Film save(Film film) {
        if (film.getId() == 0L) {
            entityManager.persist(film);
            return film;
        }
        return entityManager.merge(film);
    }

    @Override
    public Optional<Film> getById(long id) {
        return Optional.ofNullable(entityManager.find(Film.class, id));
    }

    @Override
    public void updateFilm(Film film) {
        entityManager.merge(film);
    }

    @Override
    public void deleteById(long id) {
        Film deleteFilm = entityManager.find(Film.class, id);
        entityManager.remove(deleteFilm);
    }


}

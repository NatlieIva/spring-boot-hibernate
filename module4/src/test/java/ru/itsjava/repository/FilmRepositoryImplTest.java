package ru.itsjava.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import ru.itsjava.domain.Film;
import ru.itsjava.domain.Genre;
import ru.itsjava.domain.Place;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import({FilmRepositoryImpl.class})
public class FilmRepositoryImplTest {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private FilmRepository filmRepository;

    @Test
    public void shouldCorrectGetById() {
        var place = new Place(0L, "America 1960", 1L);
        var fantasy = new Genre(0L, "fantasy");
        Film expectedFilm = new Film(0L, "Back to the future", fantasy,
                List.of(place));

        entityManager.persist(expectedFilm);
        assertNotEquals(0L, expectedFilm.getId());

        Film actualFilm = filmRepository.getById(expectedFilm.getId()).get();
        assertThat(expectedFilm).isEqualToComparingFieldByField(actualFilm);
    }
}

package ru.itsjava.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @OneToMany
    @JoinColumn(name = "film_id")
    public List<Place> places;
}
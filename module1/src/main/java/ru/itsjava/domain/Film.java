package ru.itsjava.domain;

import javax.persistence.*;


@Entity
@Table(name = "films")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "film_title")
    private String title;
}
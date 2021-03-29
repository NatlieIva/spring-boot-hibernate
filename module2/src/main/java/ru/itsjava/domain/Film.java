package ru.itsjava.domain;

import javax.persistence.*;

@Entity

public class Film {

    @Id
    private long id;
    private String title;

    @OneToOne
    private Genre genre;
}
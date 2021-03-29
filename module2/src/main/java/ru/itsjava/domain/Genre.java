package ru.itsjava.domain;

import javax.persistence.*;

@Entity
public class Genre {

    @Id
    private long id;
    private String name;
}

package ru.itsjava;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

//1. Раскоментировать зависимость spring-boot-starter-data-jpa
//2. Добавить на сущности аннотации Entity, Id и GeneratedValue

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) throws SQLException {
        var context = SpringApplication.run(MyApp.class);

//        Console.main(args);
    }
}

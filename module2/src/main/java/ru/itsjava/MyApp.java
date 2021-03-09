package ru.itsjava;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

//Проставить сущностям необходимые аннотации
//Добавить в сущность фильм поле Genre
//Прописать связь один к одному

@SpringBootApplication
public class MyApp {

    public static void main(String[] args) throws SQLException {
        var context = SpringApplication.run(MyApp.class);

        Console.main(args);
    }
}

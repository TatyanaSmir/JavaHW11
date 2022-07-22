package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void shouldFindAllAddedMovies() {
        Manager manager = new Manager();

        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        manager.addMovies("movie5");
        manager.addMovies("movie6");
        manager.addMovies("movie7");
        manager.addMovies("movie8");
        manager.addMovies("movie9");
        manager.addMovies("movie10");
        manager.addMovies("movie11");

        String[] actual = manager.findAll();
        String[] expected = {"movie1",
                "movie2",
                "movie3",
                "movie4",
                "movie5",
                "movie6",
                "movie7",
                "movie8",
                "movie9",
                "movie10",
                "movie11",
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFind5LAstAddedMovies(){

        Manager manager = new Manager(5);
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        manager.addMovies("movie5");
        manager.addMovies("movie6");
        manager.addMovies("movie7");
        manager.addMovies("movie8");
        manager.addMovies("movie9");
        manager.addMovies("movie10");
        manager.addMovies("movie11");

        String[] actual = manager.findLast();
        String[] expected = {
                "movie11",
                "movie10",
                "movie9",
                "movie8",
                "movie7"
        };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedMoviesByDefault(){
        Manager manager = new Manager();
        manager.addMovies("movie1");
        manager.addMovies("movie2");
        manager.addMovies("movie3");
        manager.addMovies("movie4");
        manager.addMovies("movie5");
        manager.addMovies("movie6");
        manager.addMovies("movie7");
        manager.addMovies("movie8");
        manager.addMovies("movie9");
        manager.addMovies("movie10");
        manager.addMovies("movie11");
        manager.addMovies("movie12");

        String[] actual = manager.findLast();
        String[] expected = {
                "movie12",
                "movie11",
                "movie10",
                "movie9",
                "movie8",
                "movie7",
                "movie6",
                "movie5",
                "movie4",
                "movie3"
        };
        Assertions.assertArrayEquals(expected, actual);

    }
}
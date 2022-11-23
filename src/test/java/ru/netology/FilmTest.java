package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    @Test
    public void shouldSetDefaultResultLength() {
        FilmData data = new FilmData();
        int expected = 10;
        int actual = data.getResultLength();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetResultLength() {
        FilmData data = new FilmData(100);
        int expected = 100;
        int actual = data.getResultLength();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCreateFilm() {
        int expectedDuration = 140;
        String expectedTitle = "Seven";
        Film film = new Film(expectedDuration, expectedTitle);
        int actualDuration = film.getDuration();
        String actualTitle = film.getTitle();
        Assertions.assertEquals(expectedDuration, actualDuration);
        Assertions.assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void shouldAddfilm() {
        Film film = new Film(154, "PulpFiction");
        FilmData manager = new FilmData();
        manager.addFilm(film);
        Film[] expected = new Film[1];
        expected[0] = film;
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        Film film1 = new Film(145, "KillBill");
        Film film2 = new Film(139, "FightClub");
        Film film3 = new Film(160, "Inception");
        FilmData manager = new FilmData(3);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        Film[] expected = new Film[3];
        expected[0] = film3;
        expected[1] = film2;
        expected[2] = film1;
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

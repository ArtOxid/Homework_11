package ru.netology;

public class FilmData {
    private Film films[];
    private int resultLength;

    public FilmData() {
        resultLength = 10;
        films = new Film[0];
    }

    public FilmData(int resultLength) {
        this.resultLength = resultLength;
        films = new Film[0];
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i].toString());
        }
        return films;
    }

    public Film[] findLast() {
        Film[] tmp = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = films[films.length - 1 - i];
            System.out.println(tmp[i].toString());
        }
        return tmp;
    }

    public int getResultLength() {
        return resultLength;
    }

}

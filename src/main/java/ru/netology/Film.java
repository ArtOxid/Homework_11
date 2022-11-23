package ru.netology;

public class Film {
    String title;
    int duration;

    public Film(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Film: " + title + " . Duration: " + duration;
    }
}

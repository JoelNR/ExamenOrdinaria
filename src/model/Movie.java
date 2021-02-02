package model;

import java.util.ArrayList;
import java.util.List;


public class Movie {
    private final CoverImage cover;
    private final String title;
    private final String year;
    private final String director;
    private final Cast cast;
    private final Genre genre;
    private final double score;
    private final double duration;

    public Movie(CoverImage cover, String title, String year, String director, Cast cast, Genre genre, double score, double duration) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.director = director;
        this.cast = cast;
        this.genre = genre;
        this.score = score;
        this.duration = duration;
    }

    public CoverImage getCover() {
        return cover;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public Cast getActors() {
        return cast;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getScore() {
        return score;
    }

    public double getDuration() {
        return duration;
    }
    
    
}

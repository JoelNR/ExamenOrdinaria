package crontrol;

import java.util.ArrayList;
import java.util.List;
import model.Genre;
import model.Movie;
import view.MovieDisplay;


public class OrderByGenreCommand implements Command{
    private final MovieDisplay movieDisplay;
    private List<Movie> movie;
    private Genre genre;

    public OrderByGenreCommand(MovieDisplay movieDisplay) {
        this.movieDisplay = movieDisplay;
        movie = new ArrayList();
    }
    
    @Override
    public void execute(List<Movie> movies) {
        System.out.println("\n" + "Movies Genre by Year");
        Genre(Genre.Action,movies);
        Genre(Genre.Comedy,movies);
        Genre(Genre.Drama,movies);
        Genre(Genre.Fantasy,movies);
        Genre(Genre.Romance,movies);
        Genre(Genre.SF,movies);
        
    }
    
    private void Genre(Genre genre, List<Movie> movies){
        for (Movie movy : movies) {
            if(movy.getGenre().equals(genre))
                this.movie.add(movy);
        }
        System.out.println("Genero: " + genre);
        movieDisplay.display(this.movie);
        this.movie.clear();
        System.out.println("\n");
    }


}

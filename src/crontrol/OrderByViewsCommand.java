package crontrol;

import java.util.ArrayList;
import java.util.List;
import model.Movie;
import view.MovieDisplay;


public class OrderByViewsCommand implements Command{
    private final MovieDisplay movieDisplay;
    private List<Movie> movie;

    public OrderByViewsCommand(MovieDisplay movieDisplay) {
        this.movieDisplay = movieDisplay;
        movie = new ArrayList();
    }
    
    @Override
    public void execute(List<Movie> movies) {
        System.out.println("No implementado, pedimos disculpas" + "\n");
    }

}

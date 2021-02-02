package crontrol;

import java.util.ArrayList;
import java.util.List;
import model.Movie;
import view.MovieDisplay;


public class OrderByGenreCommand implements Command{
    private final MovieDisplay movieDisplay;
    private List<Movie> movie;

    public OrderByGenreCommand(MovieDisplay movieDisplay) {
        this.movieDisplay = movieDisplay;
        movie = new ArrayList();
    }
    
    @Override
    public void execute(List<Movie> movies) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

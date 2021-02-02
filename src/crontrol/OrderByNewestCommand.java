package crontrol;

import java.util.ArrayList;
import java.util.List;
import model.Movie;
import view.MovieDisplay;


public class OrderByNewestCommand implements Command{
    private final MovieDisplay movieDisplay;
    private List<Movie> movie;

    public OrderByNewestCommand(MovieDisplay movieDisplay) {
        this.movieDisplay = movieDisplay;
        movie = new ArrayList();
    }
    
    @Override
    public void execute(List<Movie> movies) {
        Movie max;
        for (int i = 0; i < movies.size(); i++) {
            if(!this.movie.contains(movies.get(i))){
                max = movies.get(i);
                
                for (int j = 0; j < movies.size(); j++) {
                    if (Integer.parseInt(max.getYear()) < Integer.parseInt(movies.get(j).getYear()) && !this.movie.contains(movies.get(j))){
                        max = movies.get(j);
                    }
                }
                this.movie.add(max);
                i = 0;
            } 

        }
        System.out.println("\n" + "Movies ordered by Year");
        movieDisplay.display(this.movie);
    }

}

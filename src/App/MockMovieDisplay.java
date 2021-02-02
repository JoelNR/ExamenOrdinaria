package App;

import java.util.Arrays;
import java.util.List;
import model.Movie;
import view.MovieDisplay;


public class MockMovieDisplay implements MovieDisplay{

    @Override
    public void display(List<Movie> movies) {
        for(int i = 0; i < movies.size(); i++) {   
            System.out.print(i+1 + "." + movies.get(i).getTitle() + " ");
        }  
    }

}

package crontrol;

import java.util.List;
import model.Movie;

public interface Command {
    void execute(List<Movie> movies);
   
}

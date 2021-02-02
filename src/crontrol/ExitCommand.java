package crontrol;

import java.util.List;
import model.Movie;


public class ExitCommand implements Command{

    @Override
    public void execute(List<Movie> movies) {
        System.exit(0);
    }
}

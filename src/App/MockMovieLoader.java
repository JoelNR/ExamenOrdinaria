package App;

import java.util.ArrayList;
import java.util.List;
import model.Cast;
import model.CoverImage;
import model.Genre;
import model.Movie;
import view.MovieLoader;


public class MockMovieLoader implements MovieLoader {

    @Override
    public List<Movie> load() {
        List<Movie> list = new ArrayList<>();
        
        String[] mockCast = {"Pepe","Maria","Juan"};
        list.add(new Movie(new CoverImage("Cover1"), "TotalRecall", "2020", "Juan", new Cast(mockCast), Genre.Action, 5.5,1.5));
        list.add(new Movie(new CoverImage("Cover2"), "HomeAlone", "2020", "Pepe", new Cast(mockCast), Genre.Comedy, 7.0,2.0));
        list.add(new Movie(new CoverImage("Cover3"), "StarWars", "2010", "Maria", new Cast(mockCast), Genre.SF, 9.0,2.5));
        list.add(new Movie(new CoverImage("Cover4"), "Fast&Furious", "2018", "Juan", new Cast(mockCast), Genre.Action, 4.2,2.8));
        list.add(new Movie(new CoverImage("Cover5"), "Fast&Furious14", "2020", "Juan", new Cast(mockCast), Genre.Action, 3.2,3.5));
        list.add(new Movie(new CoverImage("Cover6"), "ThePianist", "2002", "Pepe", new Cast(mockCast), Genre.Drama, 9.0,4.0));
        list.add(new Movie(new CoverImage("Cover7"), "TheLordOfTheRing", "2021", "Maria", new Cast(mockCast), Genre.Fantasy, 10.0,3.6));
        
        
        return list;
    }

}

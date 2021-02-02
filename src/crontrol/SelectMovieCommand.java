package crontrol;


import java.util.List;
import java.util.Scanner;
import model.Movie;

public class SelectMovieCommand implements Command{
    private final Scanner scanner = new Scanner(System.in);


    @Override
    public void execute(List<Movie> movies) {
        System.out.println("Introduce the title of the movie");
        String title = scanner.next(); 
        
        for (Movie movie : movies) {
            if (title.equals(movie.getTitle())){
                System.out.println("Información de la película seleccionada: " + "Titulo: " + movie.getTitle() + " Año: " + movie.getYear() + " Director: " + movie.getDirector() 
                                    + " Genero: " + movie.getGenre() + " Duración: " + movie.getDuration() + " Puntuación: " + movie.getScore()
                );
            }
        }
    }
}

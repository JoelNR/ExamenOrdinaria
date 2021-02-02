
package App;

import crontrol.Command;
import crontrol.ExitCommand;
import crontrol.OrderByGenreCommand;
import crontrol.OrderByNewestCommand;
import crontrol.OrderByScoreCommand;
import crontrol.OrderByViewsCommand;
import crontrol.SelectMovieCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import model.Movie;
import view.MovieDisplay;

public class Main {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Command> commands;
    private final List<Movie> catalog ;
    private final MovieDisplay movieDisplay;
    
    public static void main(String[] args) {
        new Main().execute();
    }
    
     public Main(){
         catalog = new MockMovieLoader().load();
         movieDisplay = new MockMovieDisplay();
         commands = new HashMap();
         commands.put("Score",new OrderByScoreCommand(movieDisplay));
         commands.put("Views",new OrderByViewsCommand(movieDisplay));
         commands.put("Newest", new OrderByNewestCommand(movieDisplay));
         commands.put("Genre", new OrderByGenreCommand(movieDisplay)); 
         commands.put("Select", new SelectMovieCommand());
         commands.put("Exit", new ExitCommand());
         
     }
     
     private void execute() {
        System.out.println("Nuestras películas: ");
        movieDisplay.display(catalog);
        System.out.println("\n" + "Posibles comandos: Score - Views - Newest - Genre - Select - Exit" + "\n");
        while (true) {
            commands.getOrDefault(input(), null).execute(catalog);
        } 
     }
    private String input() {
        
        return scanner.next(); 
    }
}

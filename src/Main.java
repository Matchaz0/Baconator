import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ActorDatabaseBuilder actorDatabaseBuilder = new ActorDatabaseBuilder("MovieData/bacon_actors");
        ArrayList<SimpleMovie> movies = MovieDatabaseBuilder.getMovieDB("MovieData/movie_data");

//        for (SimpleMovie movie : movies) {
//            System.out.println(movie);
//        }

        // Testing
        SimpleMovie movie1 = movies.get(0);
        System.out.println(movie1.getTitle());
        System.out.println(movie1.getActors());
        System.out.println("Number of movies: " + movies.size());


        // Find all actors
        ArrayList<String> allActors1 = new ArrayList<String>();
        for (SimpleMovie movie : movies) {
            allActors1.addAll(movie.getActors());
        }
        System.out.println("Total actors: " + allActors1.size());

        // Find all unique actors
        ArrayList<String> allActors2 = new ArrayList<>(allActors1);

//        for (SimpleMovie movie : movies) {
//            ArrayList<String> tempArrayActor = movie.getActors();
//            for (String actor : tempArrayActor) {
//                if (!checkedActors.contains(actor)) {
//                    i++;
//                    System.out.println(0);
//                    checkedActors.add(actor);
//                }
//            }
//
//        }
        System.out.println("Total unique actors: " + allActors2.size());



        //

        ArrayList<SimpleMovie> bacon = new ArrayList<SimpleMovie>();
        ArrayList<String> actorsBacon1 = new ArrayList<String>();

        for (SimpleMovie movie : movies) {
            if (movie.getActors().contains("Kevin Bacon")) {
                bacon.add(movie);
            }
        }
        System.out.println(bacon.size());

        // Code to create actors data
//        actorDatabaseBuilder.createFile();
//        actorDatabaseBuilder.writeActor("Kevin Bacon", 0);

    }
}
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Movie> movies;

    public Store(){
        this.movies = new ArrayList<Movie>();
        
    }

    public Movie getMovie(int index){
        Movie copy = new Movie(this.movies.get(index));
        return copy;
    }

    public void setMovie(int index, Movie newMovie){
        Movie copy = new Movie(newMovie);
        this.movies.set(index, copy);
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public String toString(){
        String temp = " ";
        for(Movie movie : movies){
            temp += movie.toString() + "\n";
        }
        return temp;

    }


}

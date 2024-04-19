public class Store {
    private Movie[] movies;

    public Store(){
        this.movies = new Movie[10];
        
    }

    public Movie getMovie(int index){
        Movie copy = new Movie(this.movies[index]);
        return copy;
    }

    public void setMovie(int index, Movie newMovie){
        Movie copy = new Movie(newMovie);
        this.movies[index] = copy;
    }

    public String toString(){
        String temp = " ";
        for(Movie movie : movies){
            temp += movie.toString() + "\n";
        }
        return temp;

    }


}

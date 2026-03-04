package Polymorphism;

public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        AdventureMovie jaws = (AdventureMovie) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        ComedyMovie comedyMovie = (ComedyMovie) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new ComedyMovie("Airplane");
        plane.watchComedy();
    }
}

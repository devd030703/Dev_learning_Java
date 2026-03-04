package Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie theMovie = new Movie ("Star Wars");
        theMovie.watchMovie();

        Movie theAdventureMovie = new AdventureMovie("Transformers");
        theAdventureMovie.watchMovie();

        Movie theScienceFictionMovie = new ScienceFictionMovie("Tron");
        theScienceFictionMovie.watchMovie();

        Movie AvengersMovie = Movie.getMovie("Adventure", "Avengers");
        AvengersMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " + "S for Science, or Q to quit");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}



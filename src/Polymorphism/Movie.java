package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new AdventureMovie(title);
            case 'C' -> new ComedyMovie(title);
            case 'S' -> new ScienceFictionMovie(title);
            default -> new Movie (title);
        };
    }
}

class AdventureMovie extends Movie {

    public AdventureMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Pleasant Scene", "Scary Music", "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }
}

class ComedyMovie extends Movie {

    public ComedyMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Something funny happens", "Something funnier happens", "Happy ending");
    }

    public void watchComedy() {
        System.out.println("Watching a Comedy");
    }
}

class ScienceFictionMovie extends Movie {

    public ScienceFictionMovie(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3), "Bad aliens do bad stuff", "Space guys chase aliens ", "Planet blows up");
    }

    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction");
    }
}

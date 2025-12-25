public class Lesson85Challenge {

    private String name;
    private double creditLimit;
    private String email;

    public Lesson85Challenge(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Lesson85Challenge (){
        this("Nobody", 0.0, "nobody@gmail.com");
    }

    public Lesson85Challenge (String name, String email){
        this (name, 0.0, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}


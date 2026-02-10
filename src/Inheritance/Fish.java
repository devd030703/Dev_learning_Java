package Inheritance;

public class Fish extends Animal {

    private int gill;
    private int fins;

    public Fish(String type, double weight, int gill, int fins) {
        super(type, "small", weight);
        this.gill = gill;
        this.fins = fins;
    }

    private void moveMuscles() {
        System.out.println("muscles moving ");
    }

    private void moveBackFin() {
        System.out.println("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }
}

public class CodingExercise36Circle {
    private double radius;

    public CodingExercise36Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

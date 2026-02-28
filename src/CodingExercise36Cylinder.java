public class CodingExercise36Cylinder extends CodingExercise36Circle {
    private double height;

    public CodingExercise36Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}

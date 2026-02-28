public class CodingExercise37Cuboid extends CodingExercise37Rectangle {
    private double height;

    public CodingExercise37Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }

}

package CodexCode;

public class CodingExercise33 {
    private int x;
    private int y;

    public CodingExercise33() {
    }

    public CodingExercise33(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(CodingExercise33 codingExercise33) {
        return distance(codingExercise33.x, codingExercise33.y);
    }

    public double distance(int x, int y) {
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }
}

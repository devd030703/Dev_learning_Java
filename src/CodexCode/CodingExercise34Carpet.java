package CodexCode;

public class CodingExercise34Carpet {
    private double cost;

    public CodingExercise34Carpet(double cost) {
        this.cost = cost < 0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}

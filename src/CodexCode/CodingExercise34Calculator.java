package CodexCode;

public class CodingExercise34Calculator {
    private CodingExercise34Floor codingExercise34Floor;
    private CodingExercise34Carpet codingExercise34Carpet;

    public CodingExercise34Calculator(CodingExercise34Floor codingExercise34Floor, CodingExercise34Carpet codingExercise34Carpet) {
        this.codingExercise34Floor = codingExercise34Floor;
        this.codingExercise34Carpet = codingExercise34Carpet;
    }

    public double getTotalCost() {
        return codingExercise34Floor.getArea() * codingExercise34Carpet.getCost();
    }
}

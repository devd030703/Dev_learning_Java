package CodexCode;

public class CodingExercise35 {
    private double real;
    private double imaginary;

    public CodingExercise35(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(CodingExercise35 codingExercise35) {
        if (codingExercise35 == null) {
            return;
        }
        add(codingExercise35.real, codingExercise35.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(CodingExercise35 codingExercise35) {
        if (codingExercise35 == null) {
            return;
        }
        subtract(codingExercise35.real, codingExercise35.imaginary);
    }
}

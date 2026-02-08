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

    public void add(CodingExercise35 complexNumber) {
        if (complexNumber == null){
            return;
        }
        add(complexNumber.real, complexNumber.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(CodingExercise35 complexNumber) {
        if (complexNumber == null) {
            return;
        }
        subtract(complexNumber.real, complexNumber.imaginary);
    }
}

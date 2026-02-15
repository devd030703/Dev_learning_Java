package InheritanceChallenge;

public class Worker {

    private String name;
    private String birtDate;
    private String endDate;

    public Worker(String name, String birtDate, String endDate) {
        this.name = name;
        this.birtDate = birtDate;
        this.endDate = endDate;
    }

    public String getBirtDate() {
        return birtDate;
    }

    public double collectPay() {

    }
}

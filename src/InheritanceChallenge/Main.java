package InheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        Employee joe = new Employee("Joe", "03/03/1980", "01/01/2025");

        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        SalariedEmployee sarah = new SalariedEmployee("Sarah", "05/05/1985", "03/03/2020", 35000, false);
        System.out.println(sarah);
        System.out.println("Age = " + sarah.getAge());
        System.out.println("Pay = £" + sarah.collectPay());

        sarah.retire("12/12/2025");
        System.out.println("Pension check = £" + sarah.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/06/1993", "04/06/2000", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = £" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = £" + mary.collectDoublePay());

    }
}

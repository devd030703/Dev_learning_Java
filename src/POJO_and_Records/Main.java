package POJO_and_Records;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Lesson90 s = new Lesson90 (
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass"
            );
            System.out.println(s);
        }

        Lesson89 pojoStudent = new Lesson89 (
                "S923006",
                "Ann",
                "05/11/2985",
                "Java Masterclass"
        );
        Lesson90 recordStudent = new Lesson90 (
                "S923007",
                "Bill",
                "05/11/1985",
                "Java Masterclass"
        );

        System.out.println(pojoStudent);
        System.out.println(recordStudent);


    }
}

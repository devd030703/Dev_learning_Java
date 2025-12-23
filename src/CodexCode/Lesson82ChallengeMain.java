package CodexCode;

public class Lesson82ChallengeMain {
    public static void main(String[] args) {
        Lesson82Challenge account = new Lesson82Challenge();
        account.setAccountNumber("123456");
        account.setCustomerName("Alex Johnson");
        account.setEmail("alex@example.com");
        account.setPhoneNumber("555-1234");
        account.setAccountBalance(100.00);

        System.out.println("Starting balance: " + account.getAccountBalance());

        account.deposit(50.00);
        account.withdraw(30.00);
        account.withdraw(150.00);
        account.deposit(25.00);
    }
}

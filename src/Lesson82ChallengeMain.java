public class Lesson82ChallengeMain {
    public static void main(String[] args) {
        Lesson82Challenge account = new Lesson82Challenge();
        account.setAccountNumber("123456");
        account.setCustomerName("Dev Deepak");
        account.setEmail("dev@java.com");
        account.setPhoneNumber("12345678");
        account.setAccountBalance(1242.43);

        System.out.println("Starting Balance: " + account.getAccountBalance());

        account.deposit(100.00);
        account.withdraw(30.00);
        account.deposit(12.56);
        account.withdraw(42.33);

        System.out.println("New Balance: " + account.getAccountBalance());
    }
}

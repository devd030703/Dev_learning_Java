public class Lesson82Challenge {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double amount){
        if (amount <= 0){
            System.out.println("Invalid amount, can not deposit, enter a new amount");
            return;
        }
        accountBalance += amount;
        System.out.println("Deposit successful, your new account balance is " + accountBalance);
    }

    public void withdraw (double amount){
        if (amount <0){
            System.out.println("Invalid amount, can not withdraw, enter a new amount");
            return;
        }
        if (accountBalance - amount <0 ){
            System.out.println("You can not withdraw more than " + accountBalance);
            return;
        }
        accountBalance -= amount;
        System.out.println("Withdrawal successful, your new balance is " + accountBalance);
    }
}



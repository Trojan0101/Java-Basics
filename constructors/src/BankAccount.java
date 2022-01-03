public class BankAccount {

    public String customerName;
    private String email;
    private long phoneNumber;
    private int accountNumber;
    private double accountBalance;

    public BankAccount() {
        this ("DefaultName", "DefaultEmail", 0000000000L, 100, 0.0);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, long phoneNumber, int accountNumber, double accountBalance) {
        System.out.println("BankAccount constructor with parameter called");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
        this (customerName, email, phoneNumber, 100, 0.0);
        System.out.println("BankAccount constructor without accountNumber and accountBalance is called");
    }

    public void depositMoney(double depositeAmount) {
        System.out.println("Balance before deposit: " + this.accountBalance);
        System.out.println("Deposited money: " + depositeAmount);
        this.accountBalance += depositeAmount;
        System.out.println("Balance after deposit: " + this.accountBalance);
    }

    public void withdrawMoney(double withdrawalAmount) {
        if (withdrawalAmount > this.accountBalance) {
            System.out.println("Insufficient funds. Available balance: " + this.accountBalance);
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal amount: " + withdrawalAmount);
            System.out.println("Balance after withdrawal: " + this.accountBalance);
        }
    }

    // Setters and Getters

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.accountBalance = balance;
    }

}

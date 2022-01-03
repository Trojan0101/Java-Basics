public class BankAccount {

    private int accountNumber;
    private double balance;
    public String customerName;
    private String email;
    private long phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
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

    public void depositMoney(double money) {
        System.out.println("Balance before deposit: " + this.balance);
        System.out.println("Deposited money: " + money);
        this.balance += money;
        System.out.println("Balance after deposit: " + this.balance);
    }

    public void withdrawMoney(double money) {
        if (money > this.balance) {
            System.out.println("Insufficient funds. Available balance: " + this.balance);
        } else {
            this.balance -= money;
            System.out.println("Withdrawal amount: " + money);
            System.out.println("Balance after withdrawal: " + this.balance);
        }
    }

}

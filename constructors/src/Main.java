public class Main {

    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount();

        customer1.setAccountNumber(101);
        customer1.setCustomerName("Trojan");
        customer1.setEmail("trojan@example.com");
        customer1.setPhoneNumber(9988776655L);
        customer1.setBalance(30000);
        System.out.println("********************************");

        System.out.println("Customer's account number is " + customer1.getAccountNumber());
        System.out.println("Customer's name is " + customer1.getCustomerName());
        System.out.println("Customer's email is " + customer1.getEmail());
        System.out.println("Customer's phone number is " + customer1.getPhoneNumber());
        System.out.println("Customer's balance is " + customer1.getBalance());
        System.out.println("********************************");

        customer1.depositMoney(20000);
        System.out.println("********************************");
        customer1.withdrawMoney(40000);
        System.out.println("********************************");
        customer1.withdrawMoney(50000);
        System.out.println("********************************");


    }
}

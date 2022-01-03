public class Main {

    public static void main(String[] args) {

        BankAccount customer1 = new BankAccount(); // This line itself is creating the constructor automatically.

        System.out.println("Customer's name is " + customer1.getCustomerName());
        System.out.println("Customer's email is " + customer1.getEmail());
        System.out.println("Customer's phone number is " + customer1.getPhoneNumber());
        System.out.println("Customer's account number is " + customer1.getAccountNumber());
        System.out.println("Customer's balance is " + customer1.getBalance());
        System.out.println("********************************");

        // Setting values using setters

        customer1.setAccountNumber(101);
        customer1.setCustomerName("Trojan");
        customer1.setEmail("trojan@example.com");
        customer1.setPhoneNumber(9988776655L);
        customer1.setBalance(30000);

        System.out.println("Customer's name is " + customer1.getCustomerName());
        System.out.println("Customer's email is " + customer1.getEmail());
        System.out.println("Customer's phone number is " + customer1.getPhoneNumber());
        System.out.println("Customer's account number is " + customer1.getAccountNumber());
        System.out.println("Customer's balance is " + customer1.getBalance());
        System.out.println("********************************");

        customer1.depositMoney(20000);
        System.out.println("********************************");
        customer1.withdrawMoney(40000);
        System.out.println("********************************");
        customer1.withdrawMoney(50000);
        System.out.println("********************************");

        // Setting values using constructor

        BankAccount customer2 = new BankAccount("Wolf", "wolf@example.com", 8866775534L, 102, 80000);

        System.out.println("Customer's name is " + customer2.getCustomerName());
        System.out.println("Customer's email is " + customer2.getEmail());
        System.out.println("Customer's phone number is " + customer2.getPhoneNumber());
        System.out.println("Customer's account number is " + customer2.getAccountNumber());
        System.out.println("Customer's balance is " + customer2.getBalance());
        System.out.println("********************************");

        // Setting values using constructor

        BankAccount customer3 = new BankAccount("Totem", "totem@example.com", 3344665534L);

        System.out.println("Customer's name is " + customer3.getCustomerName());
        System.out.println("Customer's email is " + customer3.getEmail());
        System.out.println("Customer's phone number is " + customer3.getPhoneNumber());
        System.out.println("Customer's account number is " + customer3.getAccountNumber());
        System.out.println("Customer's balance is " + customer3.getBalance());
        System.out.println("********************************");

        System.out.println("*****VIP Customer*****");

        VipCustomer vcustomer1 = new VipCustomer();

        System.out.println("Customer's name is " + vcustomer1.getVipCustomerName());
        System.out.println("Customer's email is " + vcustomer1.getVipEmail());
        System.out.println("Customer's phone number is " + vcustomer1.getVipCreditLimit());
        System.out.println("********************************");

        VipCustomer vcustomer2 = new VipCustomer("VipWolf", "VipWolf@example.com");

        System.out.println("Customer's name is " + vcustomer2.getVipCustomerName());
        System.out.println("Customer's email is " + vcustomer2.getVipEmail());
        System.out.println("Customer's phone number is " + vcustomer2.getVipCreditLimit());
        System.out.println("********************************");

        VipCustomer vcustomer3 = new VipCustomer("VipWolf", "VipWolf@example.com", 50000);

        System.out.println("Customer's name is " + vcustomer3.getVipCustomerName());
        System.out.println("Customer's email is " + vcustomer3.getVipEmail());
        System.out.println("Customer's phone number is " + vcustomer3.getVipCreditLimit());
        System.out.println("********************************");

    }
}

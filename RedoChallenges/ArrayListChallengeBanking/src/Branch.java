import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomers(String customerName, double initialTransaction) {
        if (findCustomer(customerName) != null) {
            System.out.println(customerName + " is already a customer, and can't be registered as new.");
            return false;
        } else {
            this.customers.add(new Customer(customerName, initialTransaction));
            System.out.println(customerName + " with initial transation " + initialTransaction + " is registered.");
            return true;
        }
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            System.out.println(existingCustomer.getCustomerName() + " : " + transaction + " : Added");
            return true;
        } else {
            System.out.println(customerName + " is not registerd. Execute initial transaction.");
            return false;
        }
    }

    public Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (this.customers.get(i).getCustomerName().equals(customerName)) {
//                System.out.println(customerName + " is already a customer.");
                return this.customers.get(i);
            } else {
//                System.out.println(customerName + " is not a customer.");
            }
        }
        return null;
    }
}

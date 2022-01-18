import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            System.out.println(branchName + " is already available.");
            return false;
        } else {
            System.out.println("Branch Added: " + branchName);
            this.branches.add(new Branch(branchName));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch foundBranchName = findBranch(branchName);
        if (foundBranchName != null) {
            if (foundBranchName.findCustomer(customerName) != null) {
                System.out.println(customerName + " is already present in branch " + branchName);
                return false;
            } else {
                foundBranchName.newCustomers(customerName, transaction);
                System.out.println(customerName + " : " + transaction + ", is registerd in " + branchName + " successfully.");
                return true;
            }
        }
        System.out.println(branchName + " is not registered. Please check if the branchname is correct.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch foundBranchName = findBranch(branchName);
        if (foundBranchName != null) {
            foundBranchName.addCustomerTransaction(customerName, transaction);
        } else {
            System.out.println("Not available: " + branchName);
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getBranchName().equals(branchName)) {
//                System.out.println(branchName + " is available.");
                return this.branches.get(i);
            } else {
//                System.out.println(branchName + " is not available.");
            }
        }
//        System.out.println(branchName + " is not available");
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch foundBranchName = findBranch(branchName);
        if (foundBranchName != null && !showTransaction) {
            System.out.println("Customers names: ");
            for (int i = 0; i < foundBranchName.getCustomers().size(); i++) {
                System.out.println(foundBranchName.getCustomers().get(i).getCustomerName());
            }
            return true;
        } else if (foundBranchName != null) {
            System.out.println("Customers names with transactions: " + foundBranchName.getBranchName());
            for (int i = 0; i < foundBranchName.getCustomers().size(); i++) {
                System.out.println(foundBranchName.getCustomers().get(i).getCustomerName() + " : " + foundBranchName.getCustomers().get(i).getTransactions());
            }
            return true;
        } else {
            System.out.println("Branch is not available.");
            return false;
        }
    }
}

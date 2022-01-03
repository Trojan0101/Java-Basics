public class VipCustomer {

    private String vipcustomerName;
    private String vipemail;
    private double vipcreditLimit;

    public VipCustomer(String customerName, String email, double creditLimit) {
        System.out.println("Constructor called with all values");
        this.vipcustomerName = customerName;
        this.vipemail = email;
        this.vipcreditLimit = creditLimit;
    }

    public VipCustomer(String customerName, String email) {
        this (customerName, email, 10000);
        System.out.println("Constructor called without credit limit");
    }

    public VipCustomer() {
        this ("DefaultName", "DefaultEmail", 10000);
        System.out.println("Constructor called with default values");
    }

    // Getters

    public String getVipCustomerName() {
        return vipcustomerName;
    }

    public String getVipEmail() {
        return vipemail;
    }

    public double getVipCreditLimit() {
        return vipcreditLimit;
    }
}

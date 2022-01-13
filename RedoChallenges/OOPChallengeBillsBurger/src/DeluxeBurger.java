public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe Burger", "Mutton", 50, "Special bread");
    }

    @Override
    public void addAdditionalItems(int choice) {
        System.out.println("No additional items are available for Deluxe burger.");
    }

    @Override
    public void grandTotal() {
        System.out.println("Deluxe burger includes chips and drink by default");
        System.out.println("Grand total: " + getBasePrice());
    }

    @Override
    public void printAdditionsMenu() {
        System.out.println("No additions are available for Deluxe burger");
    }
}

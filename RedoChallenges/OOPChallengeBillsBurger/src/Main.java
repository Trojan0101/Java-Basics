public class Main {

    public static void main(String[] args) {

        System.out.println("Base Hamburger\n");
        Hamburger hamburger = new Hamburger("Base", "sauted chicken", 20, "normal");

        hamburger.printAdditionsMenu();
        hamburger.addAdditionalItems(1);
        hamburger.addAdditionalItems(1);
        hamburger.addAdditionalItems(3);
        hamburger.addAdditionalItems(4);

        hamburger.grandTotal();

        System.out.println("Healthy Hamburger\n");
        HealthyBurger healthyBurger = new HealthyBurger("mutton", 30);

        healthyBurger.printAdditionsMenu();
        healthyBurger.addAdditionalItems(5);
        healthyBurger.addAdditionalItems(6);
        healthyBurger.addAdditionalItems(1);
        healthyBurger.addAdditionalItems(2);

        healthyBurger.grandTotal();

        System.out.println("Deluxe Hamburger\n");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.printAdditionsMenu();
        deluxeBurger.addAdditionalItems(1);
        deluxeBurger.addAdditionalItems(1);
        deluxeBurger.addAdditionalItems(2);

        deluxeBurger.grandTotal();



    }
}

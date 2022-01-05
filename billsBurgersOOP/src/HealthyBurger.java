public class HealthyBurger extends BaseHamburger{

    public HealthyBurger() {
        super("Healthy Burger", "Brown Rye Bread Roll", "Soy Based meat", 10);
    }

    @Override
    public void addAdditional(int choice) {
        super.addAdditional(choice);
        switch (choice) {
            case 5: //Chicken breast
                double chickenBreastPrice = 20;
                this.setAdditionalPrice(this.getAdditionalPrice() + chickenBreastPrice);
                System.out.println("\nAdded: Chicken breast");
                break;
            case 6: //Salad
                double salad = 25;
                this.setAdditionalPrice(this.getAdditionalPrice() + salad);
                System.out.println("\nAdded: Salad");
                break;
        }
    }

    @Override
    public void checkOutOrder() {
        super.checkOutOrder();
    }

    @Override
    public void printMenu() {
        super.printMenu();
        System.out.println("5. Chicken Breast || Base price: 20");
        System.out.println("6. Ceaser Salad   || Base price: 25");
    }
}

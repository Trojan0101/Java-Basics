public class HealthyBurger extends Hamburger{

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy Burger", meat, basePrice, "Wheat bread");
    }

    @Override
    public void addAdditionalItems(int choice) {
        super.addAdditionalItems(choice);
        switch (choice) {
            case 5:
                double corn = 5;
                this.setAdditionPrice(this.getAdditionPrice() + corn);
                System.out.println("Added Corn");
                additionList.add("Corn");
                break;
            case 6:
                double oliveOil = 10;
                this.setAdditionPrice(this.getAdditionPrice() + oliveOil);
                System.out.println("Added Olive Oil");
                additionList.add("Olive Oil");
                break;
        }

    }

    @Override
    public void printAdditionsMenu() {
        super.printAdditionsMenu();
        System.out.println("Healthy Additions available\n" +
                "1. Corn ---------- 5\n" +
                "2. Olive Oil --------- 10");
    }
}

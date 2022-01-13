import java.util.ArrayList;
import java.util.List;

public class Hamburger {

    private String name;
    private String meat;
    private double basePrice;
    private String breadRollType;

    private double additionPrice = 0.0;
    public List<String> additionList = new ArrayList<>();

    public Hamburger(String name, String meat, double basePrice, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
    }

    public void printAdditionsMenu() {

        System.out.println("Base Additions available\n" +
                            "1. Cheese ---------- 5\n" +
                            "2. Mustard --------- 10\n" +
                            "3. Tomato ---------- 15\n" +
                            "4. Lettuce ---------- 20\n");
    }

    public void addAdditionalItems(int choice) {
        if (choice >= 1 && choice <= 6) {
            switch (choice) {
                case 1:
                    double cheesePrice = 5;
                    this.setAdditionPrice(this.getAdditionPrice() + cheesePrice);
                    System.out.println("Added Cheese");
                    additionList.add("Cheese");
                    break;
                case 2:
                    double mustardPrice = 10;
                    this.setAdditionPrice(this.getAdditionPrice() + mustardPrice);
                    System.out.println("Added Mustard");
                    additionList.add("Mustard");
                    break;
                case 3:
                    double tomatoPrice = 15;
                    this.setAdditionPrice(this.getAdditionPrice() + tomatoPrice);
                    System.out.println("Added Tomato");
                    additionList.add("Tomato");
                    break;
                case 4:
                    double lettucePrice = 20;
                    this.setAdditionPrice(this.getAdditionPrice() + lettucePrice);
                    System.out.println("Added Lettuce");
                    additionList.add("Lettuce");
                    break;
            }
        }

    }


    public double getAdditionPrice() {
        return additionPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setAdditionPrice(double additionPrice) {
        this.additionPrice = additionPrice;
    }

    public void grandTotal() {
        System.out.println("Base Hamburger: " + this.basePrice);

        int cheeseCount = 0;
        int mustardCount = 0;
        int tomatoCount = 0;
        int lettuceCount = 0;
        int corncount = 0;
        int oliveOilCount = 0;
        for (int i = 0; i < additionList.size(); i++) {
            if (additionList.get(i).equals("Cheese")) {
                cheeseCount += 1;
            } else if (additionList.get(i).equals("Mustard")) {
                mustardCount += 1;
            } else if (additionList.get(i).equals("Tomato")) {
                tomatoCount += 1;
            } else if (additionList.get(i).equals("Lettuce")) {
                lettuceCount += 1;
            } else if (additionList.get(i).equals("Corn")) {
                corncount += 1;
            } else if (additionList.get(i).equals("Olive Oil")) {
                oliveOilCount += 1;
            }
        }

        System.out.println("Additional items added: \n" +
                            "Cheese: " + cheeseCount + "\n" +
                            "Mustard: " + mustardCount + "\n" +
                            "Tomato: " + tomatoCount + "\n" +
                            "Lettuce: " + lettuceCount + "\n" +
                            "Corn: " + corncount + "\n" +
                            "Olive Oil: " + oliveOilCount);
        System.out.println("Grand total: " + (this.basePrice + getAdditionPrice()));
        System.out.println("========================================");
    }

}

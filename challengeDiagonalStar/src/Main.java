public class Main {

    public static void main(String[] args) {
	    printSquareStar(5);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid value");
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || col == 1 || col == number || row == col || (col == (number -  row) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


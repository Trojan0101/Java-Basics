import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);

        printArray(myIntArray);

        System.out.println("The average is: " + getAverage(myIntArray));

    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {

        System.out.println("Enter " + number + " integer values.\r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.println("Element in " + j + " is " + array[j]);
        }
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double)sum / (double)array.length;
    }
}

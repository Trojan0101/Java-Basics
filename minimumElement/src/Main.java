import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] elementArray = readElements(count);
        System.out.println("Element Array: " + Arrays.toString(elementArray));

        int min = findMin(elementArray);
        System.out.println("Minimum element: " + min);
    }

    public static Scanner scanner = new Scanner(System.in);

    public static int[] readElements(int count) {
        int[] elementArray = new int[count];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < elementArray.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            elementArray[i] = number;
        }
        scanner.close();
        return elementArray;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }
        return min;
    }


}

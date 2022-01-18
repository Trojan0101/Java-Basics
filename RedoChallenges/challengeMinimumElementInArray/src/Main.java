import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] elementArray = readIntegers(5);
        System.out.println("Array: " + Arrays.toString(elementArray));

        int minimumElement = findMin(elementArray);
        System.out.println("Minimum element: " + minimumElement);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int elementCount) {

        int[] elementArray = new int[elementCount];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < elementCount; i++) {
            elementArray[i] = scanner.nextInt();
        }
        scanner.nextLine();
        return elementArray;
    }

    public static int findMin(int[] array) {
        int arrayLength = array.length;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] < array[i + 1]) {
                if (array[i] < minValue) {
                    minValue = array[i];
                }
            }
        }
        return minValue;
    }
}

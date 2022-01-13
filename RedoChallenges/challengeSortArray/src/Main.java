import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] values = getIntegers(5);
        System.out.println("Before Sorting: ");
        printArray(values);
        System.out.println("After Sorting: ");
        printArray(sortArray(values));

    }

    public static int[] getIntegers(int numberOfElements) {

        int[] elementArray = new int[numberOfElements];

        System.out.println("Please enter the elements: ");

        for (int i = 0; i < numberOfElements; i++) {
            elementArray[i] = scanner.nextInt();
        }
        return elementArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        int temp;
        boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

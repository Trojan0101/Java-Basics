import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        System.out.println("*****Unsorted Array*****");
        printArray(array);
        int[] sortedArray = sortArray(array);
        System.out.println("*****Sorted Array*****");
        printArray(sortedArray);

    }

    private static Scanner scanner = new Scanner(System.in);

    private static int[] sortArray(int[] arrayValue) {

        int[] sortedArray = new int[arrayValue.length];
        for (int i = 0; i < arrayValue.length; i++) {
            sortedArray[i] = arrayValue[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i +  1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    private static int[] getIntegers(int number) {

        int[] values = new int[number];
        System.out.println("Enter the values:");
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
}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Value Types -> Both have different memory locations.

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue after change: " + myIntValue);
        System.out.println("anotherIntValue after change: " + anotherIntValue);

        // Reference Types -> Both reference same memory location.

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("myIntArray: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray: " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println("myIntArray after change: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray after change: " + Arrays.toString(anotherIntArray));

        modifyArray(myIntArray);

        System.out.println("myIntArray after modify: " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray after modify: " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }

}

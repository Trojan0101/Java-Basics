import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int count = 0;
        int[] modifiedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            modifiedArray[count] = array[i];
            count++;
        }
        System.out.println("Reversed Array = " + Arrays.toString(modifiedArray));
    }
}

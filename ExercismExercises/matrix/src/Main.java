import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Matrix matrix = new Matrix("1 2 3\n4 5");
        System.out.println(Arrays.toString(matrix.getRow(1)));
        System.out.println(Arrays.toString(matrix.getColumn(1)));

    }
}

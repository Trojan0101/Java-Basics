import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number: ");
            int x = scanner.nextInt();

            System.out.println("Enter the divisor: ");
            int y = scanner.nextInt();

            int z = x / y;
            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible!");
        } catch (InputMismatchException e) {
            System.out.println("Data type is wrong!");
        } catch (Exception e) {
            System.out.println("Error in program");
        } finally {
            System.out.println("Finally block.");
        }

    }
}

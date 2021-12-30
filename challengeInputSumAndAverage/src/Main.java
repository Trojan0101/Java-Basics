import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        double average = 0;
        int count = 0;
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                number = scanner.nextInt();
                count++;
                sum = sum + number;
                average = (double)sum / count;
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = "+sum+" AVG = "+ Math.round(average));
        scanner.close();
    }

}

public class Main {

    public static void main(String[] args) {

        sumFirstAndLastDigit(-1);

    }

    public static int sumFirstAndLastDigit(int number) {

        int num = number;
        if (num < 0) {
            System.out.println("Invalid number");
            return -1;
        } else {
            int lastDigit = num % 10;
            while (num >= 10) {
                num /= 10;
            }
            int sum = num + lastDigit;;
            System.out.println("The sum of first and last digit of " + number + " is " + sum);
            return sum;
        }

    }

}

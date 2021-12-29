public class Main {

    public static void main(String[] args) {

        getEvenDigitSum(252);

    }

    public static int getEvenDigitSum(int number) {

        int num = number;
        if (num < 0) {
            System.out.println("Invalid number");
            return -1;
        } else {
            int evenNum = 0;
            while (num > 0) {
                int lastDigit = num % 10;
                if (lastDigit % 2 == 0) {
                    evenNum += lastDigit;
                }
                num /= 10;
            }
            System.out.println("The sum of even digits in the given number is " + evenNum);
            return evenNum;
        }
    }

}

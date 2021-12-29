public class Main {

    public static void main(String[] args) {

        System.out.println("*****For Loop*****");
        for (int i = 8; i >= 2; i--){
            System.out.println("Amount as per interest rate " + i + "% is " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
 
        System.out.println("*****Example: Checking prime number*****");
        int count = 0;

        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)){
                System.out.println(i + " is a prime number.");
                count++;
                if (count == 3){
                    break;
                }
            } else {
                System.out.println(i + " is not a prime number");
            }
        }

    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));

    }

    public static boolean isPrime (int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}

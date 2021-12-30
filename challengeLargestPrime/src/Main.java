public class Main {

    public static void main(String[] args) {

        getLargestPrime(21);

    }

    public static int getLargestPrime (int number) {
        int num = number;
         if (number < 2) {
             System.out.println("The given value is less than 2. Invalid value.");
             return -1;
         }
         for (int i = number / 2; i > 1; i--) {
             System.out.println(number + " divided by " + i + " is " + number % i);
             if (number % i == 0) {
                 num = i;

                 for (int j = 2; j < num; j++) {
                     if (num % j == 0) {
                         System.out.println(num + " is not a prime number");
                     } else {
                         System.out.println(num + " is a prime number");
                         System.out.println("As we are looping in reverse order " + num + " is also the largest prime number");
                         break;
                     }
                 }
             break;
             }
         }
         return num;
    }

}

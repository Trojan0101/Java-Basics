public class Main {

    public static void main(String[] args) {

        isPalindrome(121);
        isPalindrome(12145);

    }

    public static boolean isPalindrome(int number) {

        int reversedNumber = 0;
        int num = number;
        while (num != 0) {
            int lastNumber = num % 10;
            reversedNumber *= 10;
            reversedNumber += lastNumber;
            num /= 10;
        }
        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome number");
            return true;
        } else {
            System.out.println(number + " is not a palindrome number");
            return false;
        }
        
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("*****While Loop*****");
        int count = 0;
        while (count != 10) {
            System.out.println(count + " is not equal to 10");
            count++;
        }

        System.out.println("*****D0 While Loop*****");
        int docount = 0;
        do {
            System.out.println(docount + " is not equal to 10");
            docount++;
        }
        while (docount == 0);
    }
}

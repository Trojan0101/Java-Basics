public class Main {

    public static void main(String[] args) {

        String stringValue = "1234";
        String newStringValue = stringValue + 1;
        System.out.println("Adding 1 to string value: " + stringValue + " gives " + newStringValue);

        int number = Integer.parseInt(stringValue);
        int newNumber = number + 1;
        System.out.println("Adding 1 to string value after parsing as integer: " + number + " gives " + newNumber);
    }
}

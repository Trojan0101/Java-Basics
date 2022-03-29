public class Main {

    public static void main(String[] args) {

        //Generic methods

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        String[] strArray = {"Aa", "Bb", "Cc", "Dd", "Ee"};

        displayArrays(intArray);
        displayArrays(doubleArray);
        displayArrays(charArray);
        displayArrays(strArray);

        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
        System.out.println(getFirstElement(strArray));

        //Generic Class
        myGenericClass<Integer> myInt = new myGenericClass<>(1);
        myGenericClass<Double> myDouble = new myGenericClass<>(3.14);
        myGenericClass<Character> myChar = new myGenericClass<>('@');
        myGenericClass<String> myStr = new myGenericClass<>("Hello");

        System.out.println(myInt.getX());
        System.out.println(myDouble.getX());
        System.out.println(myChar.getX());
        System.out.println(myStr.getX());
    }
    // Generic method
    public static <Thing> void displayArrays(Thing[] inputArray) {

        for (Thing x : inputArray) {
            System.out.print(x);
        }
        System.out.println();


    }
    //Generic methods that return a generic type
    public static <Thing> Thing getFirstElement(Thing[] inputArray) {
        return inputArray[0];
    }
}

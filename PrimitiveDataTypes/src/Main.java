public class Main {

    public static void main(String[] args) {

//        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Integer Busted MIN value = " + (myMinIntValue - 1)); // Underflow
        System.out.println("Integer Busted MAX value = " + (myMaxIntValue + 1)); // Overflow
        System.out.println("---------------------------");

//        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Busted MIN value = " + (myMinByteValue - 1)); // Underflow
        System.out.println("Byte Busted MAX value = " + (myMaxByteValue + 1)); // Overflow
        System.out.println("---------------------------");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Busted MIN value = " + (myMinShortValue - 1)); // Underflow
        System.out.println("Short Busted MAX value = " + (myMaxShortValue + 1)); // Overflow
        System.out.println("---------------------------");

//        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Busted MIN value = " + (myMinLongValue - 1)); // Underflow
        System.out.println("Long Busted MAX value = " + (myMaxLongValue + 1)); // Overflow
        System.out.println("---------------------------");

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " +myMaxFloatValue);
        System.out.println("---------------------------");

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " +myMaxDoubleValue);
        System.out.println("---------------------------");

/*
 int myIntValue = 5;
 float myFloatValue = 5.25f;
 double myDoubleValue = 5.25d;
*/

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        System.out.println("---------------------------");

        boolean myTrueBooleanValue = true;
        System.out.println(myTrueBooleanValue);
        System.out.println("---------------------------");

    }
}

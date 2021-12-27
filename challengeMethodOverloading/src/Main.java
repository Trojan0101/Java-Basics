public class Main {

    public static void main(String[] args) {

	    calcFeetAndInchesToCentimeters(2, 5);

        calcFeetAndInchesToCentimeters(-2, 10);

        calcFeetAndInchesToCentimeters(5, 13);

        calcFeetAndInchesToCentimeters(100);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <=12) {
            double oneFeet = 30.48d;
            double oneInch = 2.54d;
            double calculatedCentimeters =  (feet * oneFeet) + (inches * oneInch);
            System.out.println(feet + " feet and " + inches + " inches is " + calculatedCentimeters + " cm");
            return calculatedCentimeters;
        }
        System.out.println("Invalid inputs");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >= 0) {
            double howManyFoot = 0.0833333d;
            return calcFeetAndInchesToCentimeters((inches * howManyFoot), 0);
        }
        System.out.println("Invalid inputs");
        return -1;
    }
}

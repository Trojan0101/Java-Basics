// Removing everything except alphatets and replacing space with underscore.
public class Main {

    public static void main(String[] args) {


        System.out.println(productionRatePerHour(1));
        System.out.println(workingItemsPerMinute(10));

    }

    public static double productionRatePerHour(int speed) {
        double successRate = 0.0;
        int producedCarsAtLowestSpeed = 221;
        switch (speed) {
            case 1,2,3,4:
                successRate = 1;
                break;
            case 5,6,7,8:
                successRate = 0.9;
                break;
            case 9:
                successRate = 0.8;
                break;
            case 10:
                successRate = 0.77;
                break;
            default:
                successRate = 0;
                break;
        }
        return ((speed * producedCarsAtLowestSpeed) * successRate);
    }

    public static int workingItemsPerMinute(int speed) {
        double successRate = 0;
        switch (speed) {
            case 1,2,3,4:
                successRate = 1;
                break;
            case 5,6,7,8:
                successRate = 0.9;
                break;
            case 9:
                successRate = 0.8;
                break;
            case 10:
                successRate = 0.77;
                break;
            default:
                successRate = 0;
                break;
        }
        int carsProducedPerHour = speed * 221;
        int carsProducedPerMinute = (int)(((carsProducedPerHour / 60) * successRate) + 0.5);
        return carsProducedPerMinute;
    }
}

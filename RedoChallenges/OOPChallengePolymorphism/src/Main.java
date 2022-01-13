public class Main {

    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();

    }
}

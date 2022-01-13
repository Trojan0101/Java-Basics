public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi -> Engine Starting");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi -> Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi -> Brake");
    }
}

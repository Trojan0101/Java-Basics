class Honda extends Car {

    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Start engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> Accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> Brake";
    }
}
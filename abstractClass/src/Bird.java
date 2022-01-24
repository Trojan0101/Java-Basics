public abstract class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird --> eat() " + getName());
    }

    @Override
    public void breath() {
        System.out.println("Bird --> breath()");
    }

    public abstract void fly();
}

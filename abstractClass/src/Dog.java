public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog --> eat() " + getName());
    }

    @Override
    public void breath() {
        System.out.println("Dog --> breath()");
    }
}

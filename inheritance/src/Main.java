public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("German Shepard", 8, 20, 2, 4, 1, 20, "silky");

        animal.eat();
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Shark", 10, 100, 2, 2, 4);

        fish.swim(2);

    }
}

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        Dog dog = new Dog("Yorke");
//        dog.breath();
//        dog.eat();
//
//        Parrot parrot = new Parrot("Australian Parrot");
//        parrot.eat();
//        parrot.breath();
//        parrot.fly();
//
//        Penguin penguin = new Penguin("Black");
//        penguin.fly();

        System.out.println(twofer(""));




    }
    public static String twofer(String name) {
        if (name != null) {
            return "One for " + name + " , one for me.";
        } else {
            return "One for you, one for me.";
        }
    }

}

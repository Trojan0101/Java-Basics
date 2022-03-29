import java.io.Serializable;

public class User implements Serializable {

    //Explicit declaration of UID
    private static final long serialVersionUID = 1;

    String name;
    transient String password;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}

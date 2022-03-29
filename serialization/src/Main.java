import java.io.*;

public class Main {

    public static void main(String[] args) {

        User user = new User();

        user.name = "Trojan";
        user.password = "password123";

        //Steps to serialize an object
        try {
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("Object information saved to file: UserInfo.ser");

            long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
            System.out.println(serialVersionUID);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

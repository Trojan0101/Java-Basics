import java.io.*;

public class Main {

    public static void main(String[] args) {

        User user = null;

        try {
            FileInputStream fileIn = new FileInputStream("D:\\Development\\GitHub\\Java-Basics\\serialization\\UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);

    }
}

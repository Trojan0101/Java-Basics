import java.io.*;

public class Main {

    public static void main(String[] args) {

        // File class
        System.out.println("File class example: ");
        fileExample();

        //FileWriter class
        System.out.println("FileWriter class example: ");
        fileWriterExample();

        //FileReader class
        System.out.println("FileReader class example: ");
        fileReaderExample();



    }

    public static void fileExample() {
        File file = new File("sample.txt");

        if (file.exists()) {
            System.out.println("File exists!!!");
            System.out.println("File Path: " + file.getPath());
            System.out.println("Absolute File Path: " + file.getAbsolutePath());
            System.out.println("Is file: " + file.isFile());
            file.delete();
        } else {
            System.out.println("File does not exist");
        }
    }

    public static void fileWriterExample() {
        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("This is a new poem \nGood morning!!!");
            writer.append("\nYes this is added recently.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileReaderExample() {
        try {
            FileReader reader = new FileReader("poem.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

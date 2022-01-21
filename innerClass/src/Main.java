import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        // Non-static nested class
//        Gearbox mcLearn = new Gearbox(6);
//
//        mcLearn.operateClutch(true);
//        mcLearn.changeGear(1);
//        mcLearn.operateClutch(false);
//        System.out.println(mcLearn.wheelSpeed(1000));
//        mcLearn.changeGear(2);
//        System.out.println(mcLearn.wheelSpeed(3000));
//        mcLearn.operateClutch(true);
//        mcLearn.changeGear(3);
//        mcLearn.operateClutch(false);
//        System.out.println(mcLearn.wheelSpeed(6000));

//        // Local class
//        class ClickListner implements Button.OnClickListner {
//            public ClickListner() {
//                System.out.println("I have been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListner(new ClickListner());

        // Anonymous class
        btnPrint.setOnClickListner(new Button.OnClickListner() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}

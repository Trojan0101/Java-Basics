import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        System.out.println("Before Addition: ");
        printList(placesToVisit);

        System.out.println("After Addition: ");
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        System.out.println("After Removing: ");
        placesToVisit.remove(1);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> lList) {

        Iterator<String> i = lList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("======================================");

    }

}

//Using Linked List and For Each Loop for Print Hello, World !

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> Ways = new LinkedList<String>();
        Ways.add("He");
        Ways.add("ll");
        Ways.add("o, ");
        Ways.add("Wo");
        Ways.add("rl");
        Ways.add("d!");
        for ( String i : Ways ) {
            System.out.print(i);
        }
    }
}

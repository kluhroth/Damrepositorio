package ListasLinked;

import java.util.LinkedList;

public class UsoLinkedList {
    public static void main(String[] args) {
        ColaLinkedList<Integer> cola1= new ColaLinkedList<Integer>();
        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(4);
        System.out.println(cola1.frente());
        cola1.encolar(7);
        System.out.println(cola1.toString());
        cola1.desencolar();
        System.out.println(cola1.toString());
    }
}

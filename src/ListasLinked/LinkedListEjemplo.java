package ListasLinked;
import java.util.*;

public class LinkedListEjemplo {
    public static void main(String[] args) {
        LinkedList<Integer> cola = new LinkedList<Integer>();
        cola.addLast(1);
        cola.addLast(2);
        cola.addLast(3);
        cola.addLast(1);
        System.out.println(cola.toString());
        System.out.println("borrar el primero " + cola.remove());
        System.out.println("añadimos nuevo elemento "+ cola.add(4));
        System.out.println("eliminar la ocurrencia "+ cola.removeFirstOccurrence(1));
        System.out.println(cola.toString());

    }
}

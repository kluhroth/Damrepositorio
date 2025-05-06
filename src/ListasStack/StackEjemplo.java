package ListasStack;

import java.util.Stack;

public class StackEjemplo {
    public static void main(String[] args) {
        Stack<String> pilaString = new Stack<>();
        pilaString.add("primero");
        pilaString.add("segundo");
        pilaString.add("Tercero");
        pilaString.add("Cuarto");
        System.out.println(pilaString.toString());

        System.out.println("vacia?"+pilaString.empty());
        System.out.println("muestro la ultima posicion ->" +pilaString.peek());
        System.out.println("borro la ultima posicion->" + pilaString.pop());
        System.out.println(pilaString.toString());
        System.out.println("apilo->" +pilaString.push("quinto"));
        System.out.println(pilaString.toString());
    }
}

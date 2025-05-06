package ListasLinked;

import java.util.LinkedList;

public class ColaLinkedList<T> {
    public LinkedList<T> cola;
    public ColaLinkedList(LinkedList<T> cola){ this.cola= cola;}
    public ColaLinkedList() {cola=new LinkedList<>();}
    //AddLast,offer,offerLast: insertan el elemento al final
    public void encolar(T elemento){ cola.addLast(elemento);}
    //poll,pollfirst,pop(),remove,removeFirst devuelven y elimina el elemento situado al comienzo de la lista
    public T desencolar(){ return cola.pollFirst();}
    //element, getFirst,peek,peekFirst:devuelven el elemento situado al comienzo de la lista sin eliminarla de ella
    public T frente(){ return cola.element();}
    @Override
    public String toString(){ return cola.toString();}
}

package Interfazcollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEjemplo {
    public static void main(String[] args) {
        HashSet<String> nombres = new HashSet<>(); // te los ordena como quiere, si pones dos valores repetidos solo los muestra una vez
        nombres.add("Juan");
        nombres.add("Pia");
        nombres.add(null);
        Iterator<String> itr= nombres.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("El numero de elementos " + nombres.size());
        nombres.clear();
        System.out.println("EL numero de elementos " + nombres.size());
        nombres.add("maria");
        nombres.add("Sofia");
        nombres.remove("Sofia");
        Iterator<String> itr2= nombres.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("la coleccion esta vacia?" + nombres.isEmpty());

    }
}

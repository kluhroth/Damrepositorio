package Interfazcollection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treesetejemplo {
    public static void main(String[] args) {
        TreeSet<Integer> coleccion_numeros = new TreeSet<>();
        coleccion_numeros.add(0);
        coleccion_numeros.add(5);
        coleccion_numeros.add(3);
        coleccion_numeros.add(10);
        coleccion_numeros.add(1);
        coleccion_numeros.add(9);
        Iterator<Integer> itr = coleccion_numeros.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Saca el menor " + coleccion_numeros.first());
        System.out.println("----------------------------------");
        System.out.println("Saca el mayor " + coleccion_numeros.last());
        System.out.println("----------------------------------");
        SortedSet<Integer> coleccion_numeros_menores = coleccion_numeros.headSet(3);
        System.out.println("Sacamos el subconjunto de la coleccion que son menores que 3");
        Iterator<Integer> itr2 = coleccion_numeros_menores.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("----------------------------------");
        System.out.println(coleccion_numeros);

    }
}

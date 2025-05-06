package ListasArrays;
import java.util.*;

import java.util.ArrayList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList<Integer> coleccion_num = new ArrayList<>();
        coleccion_num.add(3);
        coleccion_num.add(2);
        coleccion_num.add(1);
        coleccion_num.add(1);
        coleccion_num.add(4);
        coleccion_num.add(5);
        Iterator<Integer> itr = coleccion_num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("-----");
        }
        System.out.println("\n");
        for (int i=0;i<coleccion_num.size();i++){
            System.out.println(coleccion_num.get(i));
            System.out.println("-----");
        }
        System.out.println("\n");
        for (int elemento:coleccion_num){
            System.out.println(elemento);
            System.out.println("-----");
        }

        System.out.println("Elemento situado en primer lugar "+coleccion_num.get(0));
        coleccion_num.set(0,33);
        coleccion_num.remove(5);
        System.out.println(coleccion_num.toString());
        System.out.println("--------------------------------");
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Pepa","Jimena","Esperanza","Manuel","Tomas"));


    }
}

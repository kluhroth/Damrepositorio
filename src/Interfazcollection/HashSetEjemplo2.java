package Interfazcollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEjemplo2 {
    public static void main(String[] args) {

    java.util.HashSet<String> alumnos = new java.util.HashSet<>();
        java.util.HashSet<String> profesores = new java.util.HashSet<>();
    alumnos.add("Aitor");
    alumnos.add("Sara");
    alumnos.add("Bilal");
    profesores.add("Lidia");
    profesores.add("Oscar");
    profesores.add("Enrique");

        profesores.addAll(alumnos);


        Iterator<String> itr2= profesores.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println("//////////////////////////////////////////////");
        Iterator<String> itr= alumnos.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


}
}

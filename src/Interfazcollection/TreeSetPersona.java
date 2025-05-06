package Interfazcollection;
import java.util.*;

public class TreeSetPersona {
    public static void main(String[] args) {
        TreeSet<Persona> listado_personas = new TreeSet<>(Comparator.comparing(Persona::getEdad).reversed());
        listado_personas.add(new Persona("Maria","513784F",24));
        listado_personas.add(new Persona("Pedro","513784K",32));
        listado_personas.add(new Persona("Juan","513784Y",38));
        listado_personas.add(new Persona("Sara","513784A",33));
        Iterator<Persona> itr = listado_personas.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }
    }
}

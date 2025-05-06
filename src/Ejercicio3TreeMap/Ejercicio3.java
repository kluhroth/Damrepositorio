package Ejercicio3TreeMap;
import java.util.*;
import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa= new HashMap<>();
        mapa.put("david",19);
        mapa.put("Adrian",23);
        mapa.put("Alberto",33);
        mapa.put("Julia",48);
        for (Map.Entry<String, Integer> entrada : mapa.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + ", Edad: " + entrada.getValue());
        }

    }
}

package TreeMapCoche;

import EjemplosTreeMap.Persona;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCoche {
    public static void main(String[] args) {
        TreeMap<Integer, Coche> Coches = new TreeMap<>();
        Coches.put(1, new Coche("4920RE", "Ford", "Azul"));
        Coches.put(193, new Coche("9918UZ", "Peugeot", "Verde"));
        Coches.put(15, new Coche("12344W", "Tesla", "Rojo"));
        Coches.put(197, new Coche("41723U", "Ferrari", "Amarillo"));
        Coches.put(791, new Coche("09142H", "Toyota", "Naranja"));
        Coches.put(345, new Coche("69561R", "Lamborghini", "Morado"));

        Coches.forEach((garaje, coche) -> {
            if (garaje < 100){
                System.out.println(garaje + "--->" +coche );
            }
        });
        System.out.println("primer coche de la segunda planta");
        Map.Entry<Integer,Coche> Entrada= Coches.ceilingEntry(100);
        System.out.println(Entrada.getKey() + "---->" + Entrada.getValue());
        System.out.println("todos los coches de la tercera planta");
        Coches.forEach((garaje, coche) -> {
            if (garaje > 200){
                System.out.println(garaje + "--->" +coche );
            }
        });


    }
}

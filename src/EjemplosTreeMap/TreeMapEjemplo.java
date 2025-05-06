package EjemplosTreeMap;
import java.util.*;

public class TreeMapEjemplo {
    public static void main(String[] args) {
        // Comparator para ordenar por edad
        Comparator<Persona> edadComparator = Comparator.comparingInt(p ->p.getEdad());
        //CREAR UN TREEMAP
        Map<Persona,String> treeMap = new TreeMap<>(edadComparator);

        //METEMOS PERSONAS
        treeMap.put(new Persona("david","1242419F",40),"Fontanero");
        treeMap.put(new Persona("anton","15612419C",40),"Medico");
        treeMap.put(new Persona("Ana","9249419A",40),"Periodista");
        //TREEMAP ORDENADO POR EDAD
        System.out.println("Treemap ordenado por edad");
        treeMap.forEach((persona,profesion) ->
        System.out.println(persona + "->" + profesion)
                );



        System.out.println("-------------- otra forma ----------------");
        Iterator<Persona> itr=treeMap.keySet().iterator();
        Persona clave;
        while (itr.hasNext()){
            clave=itr.next();
            System.out.println(clave + "->"+ treeMap.get(clave));
        }

        System.out.println("----------- otra forma --------------");
        for (Persona e: treeMap.keySet()){
            System.out.println(e + "-> "+ treeMap.get(e));
        }
    }
}

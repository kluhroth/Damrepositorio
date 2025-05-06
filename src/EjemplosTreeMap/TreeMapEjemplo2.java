package EjemplosTreeMap;
import java.util.*;

public class TreeMapEjemplo2 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> mapa= new TreeMap<>();
        mapa.put(1,1);
        mapa.put(2,2);
        mapa.put(3,3);
        mapa.put(4,4);
        // MENOR CLAVE DEL MAPA
        System.out.println("Menor clave del mapa: "+ mapa.firstKey());
        System.out.println("Mayor clave del mapa "+ mapa.lastKey());
        System.out.println("par clave-valor asociada a la menor clave de aquellas mayores o igual o pasada pro argumento"+ mapa.ceilingEntry(3));
        System.out.println("par clave-valor asociada a la menor clave de aquellas mayores estrictramente pasda por argumento"+mapa.higherEntry(3));
        System.out.println("par clave-valor asociada a la menor clave "+ mapa.firstEntry());
        System.out.println("par clave-valor asociada a la menor clave "+ mapa.lastEntry());
        SortedMap<Integer,Integer> submapa_menor = mapa.headMap(3);
        SortedMap<Integer,Integer> submapa_mayor = mapa.tailMap(2);
        System.out.println("Submapa menor" +submapa_menor.values());
        System.out.println("Submapa mayor" +submapa_mayor.values());
    }
}

package EjercicioStream;
import java.util.*;

import ListasLinked.ColaLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UsoEmpleado {
    public static void main(String[] args) throws NoNegativo {
        empleado empleado1 = new empleado("Juan",300,20);
        empleado empleado2 = new empleado("David",9000,27);
        empleado empleado3 = new empleado("Pedro",5000,18);

        ArrayList<empleado> equipo = new ArrayList<empleado>();
        equipo.add(empleado1);
        equipo.add(empleado2);
        equipo.add(empleado3);
        System.out.println(equipo);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" Ordenar por salario de mayor a menor.");
        equipo.sort(Comparator.comparing(empleado::getSalario).reversed());
        Iterator<empleado> itr = equipo.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Ordenar por salario de menor a mayor");
        equipo.sort(Comparator.comparing(empleado::getSalario));
        Iterator<empleado> itr2 = equipo.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" Ordenar por edad de mayor a menor");
        equipo.sort(Comparator.comparing(empleado::getEdad).reversed());
        Iterator<empleado> itr3 = equipo.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println(" Ordenar por edad de menor a mayor");
        equipo.sort(Comparator.comparing(empleado::getEdad));
        Iterator<empleado> itr4 = equipo.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Filtrar empleados mayores de 21 años");
        for (empleado empleado: equipo){
            if(empleado.getEdad()>21){
                System.out.println(empleado);
            }
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Filtrar empleados salario de más de 4000");
        for (empleado empleadoSalario: equipo){
            if(empleadoSalario.getSalario()>4000){
                System.out.println(empleadoSalario);
            }
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Convertir los nombres a mayúsculas");
        ArrayList<empleado> equipo2 = new ArrayList<empleado>();
        for (empleado empleadomayus: equipo){
            equipo2.add(new empleado(empleadomayus.getNombre().toUpperCase(),empleadomayus.getSalario(),empleadomayus.getEdad()));

        }
        for (empleado mostrar:equipo2){
            System.out.println(mostrar);
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Forma de filtrar mayores de 21 con filtros y stream");
        List<empleado> mayores2=new ArrayList<empleado>();
        mayores2= equipo.stream().filter(e -> e.getEdad()>21).sorted(Comparator.comparing(empleado::getEdad).reversed()).collect(Collectors.toList());
        for (empleado e:mayores2){
            System.out.println(e);
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Forma de filtrar sueldos con filtros y stream");
        List<empleado> SueldoMayor=new ArrayList<empleado>();
        SueldoMayor= equipo.stream().filter(i ->i.getSalario()>4000).sorted(Comparator.comparing(empleado::getSalario).reversed()).collect(Collectors.toList());
        for (empleado i:SueldoMayor){
            System.out.println(i);
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("modificar la lista completamente cuando quieres insertarlos en mayusculas");
        equipo.forEach(e ->e.setNombre(e.getNombre().toUpperCase()));
        equipo.forEach(System.out::println);












    }
}

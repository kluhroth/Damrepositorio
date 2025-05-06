package Ejercicio2Entregable;
import java.util.*;
import java.io.*;

public class UsoEmpleado2 {
    public static void main(String[] args) {
        List<Empleado> empleados = leerarchivo("src/Ejercicio2Entregable/empleados2.txt");
        empleados.forEach(System.out::println);
    }

    private static List<Empleado> leerarchivo(String archivo2) {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader leer = new BufferedReader(new FileReader(archivo2))) {
            String linea;
            while ((linea = leer.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty() && linea.length() > 3) {
                    String[] nombreapellidos = linea.split("#");
                    String[] contacto = leer.readLine().split("#");
                    if (nombreapellidos.length == 4 && contacto.length == 2) {
                        empleados.add(new Empleado(nombreapellidos[0], nombreapellidos[1], nombreapellidos[2],
                                Integer.parseInt(nombreapellidos[3]), contacto[0], contacto[1]));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return empleados;
    }

}



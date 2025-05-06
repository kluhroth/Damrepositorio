package PracticaFinal;
import java.util.*;
import java.io.*;
public class UsoVehiculo {
    public static void main(String[] args) {
        HashSet<Coche> listacoches = new HashSet<>();
        HashSet<Coche> listamotos = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("vehiculos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {

            }
            String[] campos = linea.split("#");
            

                System.out.println("matricula: " + campos[0]);
                System.out.println("marca: " + campos[1]);
                System.out.println("modelo: " + campos[2]);
                System.out.println("anyo: " + campos[3]);
                System.out.println("tipocombustible: " + campos[4]);
            System.out.println("numero de puertas: " + campos[5]);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}

package Ejercicio;
import EjercicioFicheros.Alumno;

import java.util.*;
import java.io.*;
public class UsoEmpleado {
    public static void main(String[] args) {
        leerempleados();
        System.out.println("Quieres añadir un nuevo empleado?\n1-si\n2-no");
        Scanner scanner = new Scanner(System.in);
        int opcion= scanner.nextInt();
        switch (opcion) {
            case 1:
                meterempleados();
                break;
            case 2:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("adios");
        }
    }
    public static void leerempleados() {
        Scanner sc = new Scanner(System.in);
        String archivo = "src/Ejercicio/Empleados.txt";
        File file = new File(archivo);
        try(BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            String empleado[];
            while((linea = reader.readLine())!=null) {
                empleado = linea.split(";");
                List<Empleado> Empleado = new ArrayList<>();
                Double salarioDouble = Double.valueOf(String.valueOf(empleado[2]));
                Empleado.add(new Empleado(empleado[0],empleado[1], salarioDouble));
                for(Empleado puntero : Empleado) {
                    System.out.println(puntero);
                }
            }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void meterempleados(){
        try (Scanner scanner = new Scanner(System.in)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime tu dni");
            String dni = sc.next();
            System.out.println("Dime tu nombre");
            String nombre = sc.next();
            System.out.println("Dime tu salario ");
            double salario = scanner.nextDouble();
            Empleado empleado1= new Empleado(dni,nombre,salario);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Ejercicio/Empleados.txt", true))) {
                writer.newLine();
                writer.write(empleado1.toString());

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}

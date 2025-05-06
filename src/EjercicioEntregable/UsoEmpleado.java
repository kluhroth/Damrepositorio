package EjercicioEntregable;
import EjercicioEntregable.Empleado;

import java.util.*;
import java.io.*;
public class UsoEmpleado {
    private static final String FILE_PATH = "/src/EjercicioEntregable/Empleados.txt";
    public static void main(String[] args) {

        leerEmpleados().forEach(System.out::println);
        leerEmpleados();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("DNI: ");
            String dni = scanner.nextLine();
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Salario: ");
            double salario = scanner.nextDouble();
            escribirEmpleado(new Empleado(dni, nombre, salario));
                }
            }

        private static List<Empleado> leerEmpleados() {
            List<Empleado> empleados = new ArrayList<>();
            try (BufferedReader leer = new BufferedReader(new FileReader(FILE_PATH))) {
                leer.lines().map(Empleado::fromString).forEach(empleados::add);
            } catch (IOException ignored) {}
            return empleados;
        }

        private static void escribirEmpleado(Empleado empleado) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
                writer.write(empleado + "\n");
            } catch (IOException ignored) {}
        }
    }



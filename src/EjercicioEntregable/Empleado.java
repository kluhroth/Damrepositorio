package EjercicioEntregable;

import java.io.*;
import java.util.*;

public class Empleado {
    private String dni, nombre;
    private double salario;

    public Empleado(String dni, String nombre, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
    }

    public static Empleado fromString(String linea) {
        String[] datos = linea.split(";");
        return new Empleado(datos[0], datos[1], Double.parseDouble(datos[2]));
    }

    @Override
    public String toString() {
        return String.join(";", dni, nombre, String.valueOf(salario));
    }
}


package EjercicioFicheros;
import java.util.*;
import java.util.Arrays;
import java.io.*;
public class Alumno {
    String dni;
    String nombre;
    Asignaturas [] asignatura = new Asignaturas[3];


    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                "; nombre='" + nombre + '\'' +
                "; asignatura=" + Arrays.toString(asignatura) +
                '}';
    }

    public Alumno() {
    }

    public Alumno(String dni, String nombre, Asignaturas[] asignatura) {
        this.dni = dni;
        this.nombre = nombre;
        if (asignatura.length >3){
            throw new IllegalArgumentException("Un alumno no puede matricularse en mas de 3 asignaturas");
        }
        this.asignatura = asignatura;

    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignaturas[] getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignaturas[] asignatura) {
        this.asignatura = asignatura;
    }

    public void insertarusuarios(String usuarios){

    }



}

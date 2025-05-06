package Ejercicio;

public class Empleado {
    public String dni;
    public String nombre;
    public double salario;


    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                "; nombre='" + nombre + '\'' +
                "; salario=" + salario +
                '}';
    }

    //constructores
    public Empleado() {
    }
    public Empleado(String dni, String nombre, double salario) {
        this.dni = dni;
        this.nombre = nombre;
        this.salario = salario;
    }

    //getters y setters

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

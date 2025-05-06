package Ejercicio2Entregable;

public class Empleado {
    private String dni, nombre, apellido, telefono, email;
    private int anyoNac;

    public Empleado(String dni, String nombre, String apellido, int anyoNac, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anyoNac = anyoNac;
        this.telefono = telefono;
        this.email = email;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", anyoNac=" + anyoNac +
                '}';
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnyoNac() {
        return anyoNac;
    }

    public void setAnyoNac(int anyoNac) {
        this.anyoNac = anyoNac;
    }
}

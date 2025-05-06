package EjercicioLibre2204;

public class Cantante {
    private String nombre;
    private String estilo;
    private int edad;

    //constructores

    public Cantante() {
    }

    public Cantante(String nombre, String estilo, int edad) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.edad = edad;
    }


    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", estilo='" + estilo + '\'' +
                ", edad=" + edad;
    }

}

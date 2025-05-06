package Ejercicio2304examen;

public class Pelicula {

    //atributos

    private int id;
    private String titulo;
    private Genero genero;
    private int estreno;

    //constructores


    public Pelicula(String titulo, String genero, int estreno) {
        this.titulo = titulo;
        this.genero = Genero.valueOf(genero);
        this.estreno = estreno;
    }

    public Pelicula() {
    }

    //getters y setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }

    //tostring


    @Override
    public String toString() {
        return "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero=" + genero +
                ", estreno=" + estreno;
    }
}

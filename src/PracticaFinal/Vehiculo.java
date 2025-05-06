package PracticaFinal;

public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private int anyo;
    private String tipo_de_combustible;






    //constructores

    public Vehiculo(String matricula, String marca, String modelo, int anyo, String tipo_de_combustible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anyo = anyo;
        this.tipo_de_combustible = tipo_de_combustible;
    }

    public Vehiculo() {
    }

    //getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getTipo_de_combustible() {
        return tipo_de_combustible;
    }

    public void setTipo_de_combustible(String tipo_de_combustible) {
        this.tipo_de_combustible = tipo_de_combustible;
    }
}

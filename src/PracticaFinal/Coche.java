package PracticaFinal;

public class Coche extends Vehiculo{
    private int n_puertas;


    //constructores

    public Coche(String matricula, String marca, String modelo, int anyo, String tipo_de_combustible, int n_puertas) {
        super(matricula, marca, modelo, anyo, tipo_de_combustible);
        this.n_puertas = n_puertas;
    }

    public Coche() {
    }

    //getters y setters

    public int getN_puertas() {
        return n_puertas;
    }

    public void setN_puertas(int n_puertas) {
        this.n_puertas = n_puertas;
    }
}

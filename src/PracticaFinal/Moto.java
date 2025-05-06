package PracticaFinal;

public class Moto extends Vehiculo{
    private int n_ruedas;
    private boolean sidecar;

    //constructores
    public Moto(String matricula, String marca, String modelo, int anyo, String tipo_de_combustible, int n_ruedas, boolean sidecar) {
        super(matricula, marca, modelo, anyo, tipo_de_combustible);
        this.n_ruedas = n_ruedas;
        this.sidecar = sidecar;
    }

    public Moto() {
    }
    //getters y setters

    public int getN_ruedas() {
        return n_ruedas;
    }

    public void setN_ruedas(int n_ruedas) {
        this.n_ruedas = n_ruedas;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}

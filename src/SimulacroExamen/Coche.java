package SimulacroExamen;

public class Coche extends Vehiculo {
    private int nPuertas;

    public Coche(String matricula, String marca, String modelo, int año, String tipoCombustible, int nPuertas) {
        super(matricula, marca, modelo, año, tipoCombustible);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "#" + nPuertas;
    }
}
package SimulacroExamen;

public class Moto extends Vehiculo {
    public int nRuedas;
    private boolean sidecar;

    public Moto(String matricula, String marca, String modelo, int año, String tipoCombustible, int nRuedas, boolean sidecar) {
        super(matricula, marca, modelo, año, tipoCombustible);
        this.nRuedas = nRuedas;
        this.sidecar = sidecar;
    }

    public boolean tieneSidecar() {
        return sidecar;
    }

    @Override
    public String toString() {
        return super.toString() + "#" + nRuedas + "#" + sidecar;
    }
}
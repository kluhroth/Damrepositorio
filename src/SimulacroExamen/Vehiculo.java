package SimulacroExamen;

// Clase abstracta Vehiculo
public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected int año;
    protected String tipoCombustible;

    public Vehiculo(String matricula, String marca, String modelo, int año, String tipoCombustible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters y equals/hashCode por matrícula
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehiculo) {
            return this.matricula.equals(((Vehiculo) obj).matricula);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return matricula.hashCode();
    }

    @Override
    public String toString() {
        return matricula + "#" + marca + "#" + modelo + "#" + año + "#" + tipoCombustible;
    }
}
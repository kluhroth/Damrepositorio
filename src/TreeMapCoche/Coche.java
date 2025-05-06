package TreeMapCoche;

public class Coche {
    public String matricula;
    public String marca;
    public String Color;





    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }

    public Coche() {
    }

    public Coche(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        Color = color;
    }

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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

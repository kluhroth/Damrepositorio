package EjercicioStream;

public class empleado {
    public String nombre;
    public double salario;
    public int edad;


    public empleado(String nombre, double salario, int edad) throws NoNegativo {
        this.nombre = nombre;
        if(salario <0){
            throw new NoNegativo("el salario no puede ser negativo");
        }
        this.salario = salario;
        if(edad <1){
            throw new NoNegativo("la edad tiene que ser mayor");
        }
        this.edad = edad;

    }

    @Override
    public String toString() {
        return "empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws NoNegativo {
        if(salario <0){
            throw new NoNegativo("el salario no puede ser negativo");
        }
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws NoNegativo{
        if(edad <1){
            throw new NoNegativo("la edad tiene que ser mayor");
        }
        this.edad = edad;
    }
}

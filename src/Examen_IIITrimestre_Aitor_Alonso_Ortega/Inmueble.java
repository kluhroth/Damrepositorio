package Examen_IIITrimestre_Aitor_Alonso_Ortega;

public abstract class Inmueble {
    public int id;
    public String nombre;
    public int anyo_edificacion;
    public String direccion;
    public double ibi;
    public double m2;

    //metodo
    public double calcular_ibi() {
        return ibi;
    }
    //constructores

    public Inmueble(int id, String nombre, int anyo_edificacion, String direccion, double ibi, double m2) {
        this.id = id;
        this.nombre = nombre;
        this.anyo_edificacion = anyo_edificacion;
        this.direccion = direccion;
        this.ibi = calcular_ibi();
        this.m2 = m2;
    }

    public Inmueble() {
    }
    //getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyo_edificacion() {
        return anyo_edificacion;
    }

    public void setAnyo_edificacion(int anyo_edificacion) {
        this.anyo_edificacion = anyo_edificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getIbi() {
        return ibi;
    }

    public void setIbi(double ibi) {
        this.ibi = ibi;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }
    //tostring

    @Override
    public String toString() {
        return
                id +"#"+ nombre +"#"+ anyo_edificacion+"#" + direccion+"#" + ibi +"#" + m2;
    }
}

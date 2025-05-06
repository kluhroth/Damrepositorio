package EjercicioBDRconJava;

public class Jugador {
    private int id;
    private String nombre;
    private int edad;
    private String posicion;
    private String equipo;
    private String nacionalidad;
    private int goles;
    private int asistencias;
    private int partidosJugados;

    // Constructor

    public Jugador() {
    }

    public Jugador(int id, String nombre, int edad, String posicion, String equipo, String nacionalidad, int goles, int asistencias, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.equipo = equipo;
        this.nacionalidad = nacionalidad;
        this.goles = goles;
        this.asistencias = asistencias;
        this.partidosJugados = partidosJugados;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", goles=" + goles +
                ", asistencias=" + asistencias +
                ", partidosJugados=" + partidosJugados +
                '}';
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
}

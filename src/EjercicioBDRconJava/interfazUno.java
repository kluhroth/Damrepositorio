package EjercicioBDRconJava;
import java.util.*;
public interface interfazUno {
    public void conectar();
    public void crearBaseDeDatosYTabla(String BaseDeDatos);
    public void crearJugador(Jugador jugador);
    List<Jugador> obtenerJugadores();
    public void actualizarJugador(Jugador jugador);
}

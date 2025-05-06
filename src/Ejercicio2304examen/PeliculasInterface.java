package Ejercicio2304examen;
import java.sql.SQLException;
import java.util.*;

public interface PeliculasInterface {
    void crearTabla() throws SQLException;
    void eliminarTabla() throws SQLException;
    void crearPelicula(Pelicula pelicula) throws SQLException;
    void crearPelicula() throws SQLException;
    void eliminarPelicula(int id) throws SQLException;
    Pelicula buscarPelicula(int id) throws SQLException;
    ArrayList<Pelicula> buscarTodo();
    ArrayList<Pelicula> buscarPorGenero(String genero);

}

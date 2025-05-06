package Ejercicio2304examen;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

public class Peliculas implements PeliculasInterface {

    public static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica3","root","admin");
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }


    @Override
    public void crearTabla() throws SQLException {
        Statement stmt=conn.createStatement();
        String query0="drop table if exists infopelicula;";
        String query="Create table infopelicula( "+ "codigo int primary key auto_increment, "+ "titulo varchar(150), "
                + "Genero varchar (255),"+"Estreno int"+ ");";
        stmt.executeUpdate(query0);
        stmt.executeUpdate(query);

    }

    @Override
    public void eliminarTabla() throws SQLException {
        Statement stmt=conn.createStatement();
        String query="drop table infopelicula;";
        stmt.executeUpdate(query);



    }

    @Override
    public void crearPelicula(Pelicula pelicula) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/practica3";

        String user = "root";

        String password = "admin";


        String sql = "INSERT INTO infopelicula (titulo, genero, estreno) VALUES (?, ?, ?);";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pelicula.getTitulo());
            pstmt.setString(2, String.valueOf(pelicula.getGenero()));
            pstmt.setInt(3, pelicula.getEstreno());
            pstmt.executeUpdate();

            System.out.println("pelicula insertada correctamente en la base de datos");


        } catch (SQLException e) {

            System.err.println(e.getMessage());

        }
    }



    @Override
    public void crearPelicula() throws SQLException {

    }

    @Override
    public void eliminarPelicula(int id) throws SQLException {
        Statement stmt=conn.createStatement();
        String query="DELETE FROM infopelicula WHERE codigo = "+ id + ";";
        stmt.executeUpdate(query);

    }

    @Override
    public Pelicula buscarPelicula(int id) throws SQLException {
        return null;
    }

    @Override
    public ArrayList<Pelicula> buscarTodo() {
        return null;
    }

    @Override
    public ArrayList<Pelicula> buscarPorGenero(String genero) {
        return null;
    }

}

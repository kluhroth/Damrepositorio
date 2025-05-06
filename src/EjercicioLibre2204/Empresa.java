package EjercicioLibre2204;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.io.*;
import java.sql.*;
    public class Empresa {
        private static final String URL = "jdbc:mysql://localhost:3306/";
        private static final String USER = "root";
        private static final String PASSWORD = "admin";
        private Connection conexion;
        private String BaseDeDatos;
        ArrayList<Cantante> listaCantantes = new ArrayList<>();

        public ArrayList<Cantante> contratarCantantes(String nombre, String estilo, int edad) {
            Cantante nuevo = new Cantante(nombre, estilo, edad);
            listaCantantes.add(nuevo);
            insertarCantanteBD(nuevo);
            return listaCantantes;
        }
        public void guardarEnArchivo(String CantantesContratados) {
            try (BufferedWriter contratados = new BufferedWriter(new FileWriter(CantantesContratados))) {
                for (Cantante cantante : listaCantantes) {
                    contratados.write(cantante.getNombre() + "," + cantante.getEstilo() + "," + cantante.getEdad());
                    contratados.newLine();
                }
                System.out.println("Hemos contratado a estos cantantes");
            } catch (IOException e) {
                System.out.println("No hemos podido contratar " + e.getMessage());
            }
        }

        public static void insertarCantanteBD(Cantante cantante) {


            String url = "jdbc:mysql://localhost:3306/shadyrecords";

            String user = "root";

            String password = "admin";


            String sql = "INSERT INTO cantantes (nombre, genero, edad) VALUES (?, ?, ?);";


            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, cantante.getNombre());
                pstmt.setString(2, cantante.getEstilo());
                pstmt.setInt(3, cantante.getEdad());
                pstmt.executeUpdate();

                System.out.println("Cliente insertado correctamente en la base de datos");


            } catch (SQLException e) {

                System.err.println(e.getMessage());

            }
        }



    }


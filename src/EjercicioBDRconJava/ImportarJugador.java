package EjercicioBDRconJava;
import java.sql.*;
import java.util.*;

public class ImportarJugador implements interfazUno {
        private static final String URL = "jdbc:mysql://localhost:3306/";
        private static final String USER = "root";
        private static final String PASSWORD = "admin";
        private Connection conexion;
        private String BaseDeDatos;

        public ImportarJugador(String BaseDeDatos) {
            this.BaseDeDatos = BaseDeDatos;
        }

        @Override
        public void conectar() {
            try {
                conexion = DriverManager.getConnection(URL + BaseDeDatos, USER, PASSWORD);
                System.out.println("Conectado a la base de datos: " + BaseDeDatos);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void crearBaseDeDatosYTabla(String nombreBD) {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement()) {

                stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + nombreBD);
                System.out.println("la base de datos se ha creado");

                conectar();

                String sql = "CREATE TABLE IF NOT EXISTS jugadores (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                        "nombre VARCHAR(500)," +
                        "edad INT," +
                        "posicion VARCHAR(150)," +
                        "equipo VARCHAR(300)," +
                        "nacionalidad VARCHAR(100)," +
                        "goles INT," +
                        "asistencias INT," +
                        "partidos_jugados INT)";
                Statement st = conexion.createStatement();
                st.executeUpdate(sql);
                System.out.println("Creamos la base de datos");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void crearJugador(Jugador jugador) {
            String sql = "INSERT INTO jugadores (nombre, edad, posicion, equipo, nacionalidad, goles, asistencias, partidos_jugados) VALUES (?,?,?,?,?,?,?,?)";
            try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                ps.setString(1, jugador.getNombre());
                ps.setInt(2, jugador.getEdad());
                ps.setString(3, jugador.getPosicion());
                ps.setString(4, jugador.getEquipo());
                ps.setString(5, jugador.getNacionalidad());
                ps.setInt(6, jugador.getGoles());
                ps.setInt(7, jugador.getAsistencias());
                ps.setInt(8, jugador.getPartidosJugados());
                ps.executeUpdate();
                System.out.println("Jugador creado correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        @Override
        public List<Jugador> obtenerJugadores() {
            List<Jugador> jugadores = new ArrayList<>();
            String sql = "SELECT * FROM jugadores";
            try (Statement stmt = conexion.createStatement();
                 ResultSet resultado = stmt.executeQuery(sql)) {

                while (resultado.next()) {
                    Jugador jugador = new Jugador(
                            resultado.getInt("id"),
                            resultado.getString("nombre"),
                            resultado.getInt("edad"),
                            resultado.getString("posicion"),
                            resultado.getString("equipo"),
                            resultado.getString("nacionalidad"),
                            resultado.getInt("goles"),
                            resultado.getInt("asistencias"),
                            resultado.getInt("partidos_jugados")
                    );
                    jugadores.add(jugador);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return jugadores;
        }

        @Override
        public void actualizarJugador(Jugador jugador) {
            String sql = "UPDATE jugadores SET nombre=, edad=, posicion=, equipo=, nacionalidad=, goles=, asistencias=, partidos_jugados=? WHERE id=?";
            try (PreparedStatement psstmt = conexion.prepareStatement(sql)) {
                psstmt.setString(1, jugador.getNombre());
                psstmt.setInt(2, jugador.getEdad());
                psstmt.setString(3, jugador.getPosicion());
                psstmt.setString(4, jugador.getEquipo());
                psstmt.setString(5, jugador.getNacionalidad());
                psstmt.setInt(6, jugador.getGoles());
                psstmt.setInt(7, jugador.getAsistencias());
                psstmt.setInt(8, jugador.getPartidosJugados());
                psstmt.setInt(9, jugador.getId());
                psstmt.executeUpdate();
                System.out.println("Se han cambiado los datos solicitados para este jugador");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


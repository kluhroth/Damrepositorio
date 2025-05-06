package SimulacroExamen;
import java.io.*;
import java.util.*;
import java.sql.*;

public class UsoVehiculo {
    public static void main(String[] args) throws SQLException {
        // Leer archivo y cargar en colecciones sin duplicados
        Set<Coche> coches = new HashSet<>();
        Set<Moto> motos = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("vehiculos.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("#");
                if (partes.length == 6) {
                    coches.add(new Coche(partes[0], partes[1], partes[2],
                            Integer.parseInt(partes[3]), partes[4], Integer.parseInt(partes[5])));
                } else if (partes.length == 7) {
                    motos.add(new Moto(partes[0], partes[1], partes[2],
                            Integer.parseInt(partes[3]), partes[4],
                            Integer.parseInt(partes[5]), Boolean.parseBoolean(partes[6])));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Base de Datos con JDBC (MySQL o H2 por ejemplo)
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS PractFinal");
        stmt.executeUpdate("USE PractFinal");

        // Crear tablas
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Vehiculo (" +
                "matricula VARCHAR(10) PRIMARY KEY, marca VARCHAR(50), modelo VARCHAR(50), año INT, tipo_combustible VARCHAR(20))");

        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Coche (" +
                "matricula VARCHAR(10), n_puertas INT, FOREIGN KEY (matricula) REFERENCES Vehiculo(matricula))");

        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS Moto (" +
                "matricula VARCHAR(10), n_ruedas INT, sidecar BOOLEAN, FOREIGN KEY (matricula) REFERENCES Vehiculo(matricula))");
        //Insertar datos:
        PreparedStatement psVehiculo = conn.prepareStatement("INSERT INTO Vehiculo VALUES (?, ?, ?, ?, ?)");
        PreparedStatement psCoche = conn.prepareStatement("INSERT INTO Coche VALUES (?, ?)");
        PreparedStatement psMoto = conn.prepareStatement("INSERT INTO Moto VALUES (?, ?, ?)");




        //OTRA FORMA DE HACERLO: String query = "INSERT INTO vehiculos(matricula, marca, anho, modelo, tipo_combustible) " + "VALUES ('" + matricula + "', '" + marca + "', " + anho + ", '" + modelo + "', '" + tipo_combustible + "');";
        // stmt.executeUpdate(query);

        for (Coche c : coches) {
            psVehiculo.setString(1, c.matricula);
            psVehiculo.setString(2, c.marca);
            psVehiculo.setString(3, c.modelo);
            psVehiculo.setInt(4, c.año);
            psVehiculo.setString(5, c.tipoCombustible);
            psVehiculo.executeUpdate();

            psCoche.setString(1, c.matricula);
            psCoche.setInt(2, c.getnPuertas());
            psCoche.executeUpdate();
        }

        for (Moto m : motos) {
            psVehiculo.setString(1, m.matricula);
            psVehiculo.setString(2, m.marca);
            psVehiculo.setString(3, m.modelo);
            psVehiculo.setInt(4, m.año);
            psVehiculo.setString(5, m.tipoCombustible);
            psVehiculo.executeUpdate();

            psMoto.setString(1, m.matricula);
            psMoto.setInt(2, m.nRuedas);
            psMoto.setBoolean(3, m.tieneSidecar());
            psMoto.executeUpdate();
        }
        //Generar Menú de Exportación a TXT
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Exportar motos");
        System.out.println("2. Exportar coches");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("motos.txt"))) {
                for (Moto m : motos) {
                    bw.write(m.toString());
                    bw.newLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (opcion == 2) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("coches.txt"))) {
                for (Coche c : coches) {
                    bw.write(c.toString());
                    bw.newLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }

}

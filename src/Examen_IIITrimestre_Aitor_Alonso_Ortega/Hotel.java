package Examen_IIITrimestre_Aitor_Alonso_Ortega;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Hotel extends Inmueble{
    public boolean isPetFriendly;




    //constructores

    public Hotel(int id, String nombre, int anyo_edificacion, String direccion, double ibi, double m2, boolean isPetFriendly) {
        super(id, nombre, anyo_edificacion, direccion, ibi, m2);
        this.isPetFriendly = isPetFriendly;
    }


    //getters y setters

    public boolean isPetFriendly() {
        return isPetFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        isPetFriendly = petFriendly;
    }
    //metodo
    public double calcular_ibi(){
        int edad_edificio=2025-anyo_edificacion;
        ibi=m2*100+50*edad_edificio;
        return ibi;
    }
    public static void crearBD() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS examen_tercera");
        stmt.executeUpdate("USE examen_tercera");
    }
}

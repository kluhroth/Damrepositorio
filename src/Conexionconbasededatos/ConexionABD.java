package Conexionconbasededatos;
import java.sql.*;
import java.sql.SQLException;
import java.util.Arrays;

public class ConexionABD  {
    public static void main(String[] args) throws SQLException {
        Connection conexion= conectar(null);
        String query= "use nueva";
        Statement stmt=conexion.createStatement();
        stmt.executeUpdate(query);
        System.out.println("apuntada la base de datos");


        crearBasedeDatos(conexion);
        introducirValoresYmostrarlos(conexion);
    }
    private static void borrar(Connection conexion) throws SQLException{
        String query = "truncate mascota";
        Statement stmt=conexion.createStatement();
        stmt.executeUpdate(query);
    }
    private static Connection conectar(Connection conexion) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String PASSWORD = "admin";
        try {
            if (conexion==null || conexion.isClosed()){
                conexion= DriverManager.getConnection(url,user,PASSWORD);
                System.out.println("conexion establecida");
            }
        }catch (SQLException e){}

        return conexion;
    }
    private static void crearBasedeDatos(Connection conexion) throws SQLException {
        Statement stmt=conexion.createStatement();
       String query= "Create database Nueva;" ;
       stmt.executeUpdate("drop database if exists Nueva");
        stmt.executeUpdate(query);
        query= "use Nueva;";
        stmt.executeUpdate(query);
        System.out.println("base de datos inicializada");
        String query2="Create table mascota( "+ "codigo int primary key auto_increment, "+ "nombre varchar(50), "
                + "descripcion varchar (255)"+ ");";
        stmt.executeUpdate(query2);
        String query3= "insert into mascota (codigo,nombre,descripcion) values (11111,'hola', 'chimpance');";
        stmt.executeUpdate(query3);
        query3= "insert into mascota (codigo,nombre,descripcion) values (22222,'david', 'chihuahua');";
        stmt.executeUpdate(query3);
    }
    private static void introducirValoresYmostrarlos(Connection conexion) throws SQLException{
        String query= "insert into mascota (codigo,nombre,descripcion) values (14300125,'ramon', 'lagarto');";
        Statement stmt = conexion.createStatement();
        stmt.executeUpdate("use Nueva;");
        stmt.executeUpdate(query);
        System.out.println("Registro realizado");
        ResultSet resultado= stmt.executeQuery("select * from mascota;");
        while (resultado.next()){
            System.out.println(resultado.getInt(1)+"");
            System.out.println(resultado.getString(2));
            System.out.println(resultado.getString(3));
        }
    }


    }
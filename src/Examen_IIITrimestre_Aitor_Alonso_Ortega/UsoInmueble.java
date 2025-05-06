package Examen_IIITrimestre_Aitor_Alonso_Ortega;

import java.util.*;
import java.io.*;
import java.sql.*;
public class UsoInmueble {
    public static void main(String[] args) throws SQLException {
        ArrayList<Hotel> hotelesmascotas = new ArrayList<>();

        System.out.println("Introduzca una opcion:\n0-salir \n1-conectar BD \n2-crear BD \n3-crear tabla \n4-insertar en tabla \n5-Arraylist");
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        menu = sc.nextInt();
        switch (menu) {
            case 0: {
                System.out.println("gracias por usar este programa");
                break;

            }
            case 1: {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
                System.out.println("Conexion establecida");
                break;


            }
            case 2:
                crearBD();
                System.out.println("Base de datos creada correctamente");
                System.out.println("Base de datos asignada");
                break;
            case 3:
                crearBD();
                crearTabla();
                System.out.println("tabla hotel creada correctamente"); /* esto no se pide pero lo veo bien para verificar errores */
//break;


            case 4:
                insertarRegistro();
                System.out.println("registro creado correctamente");

            case 5:
                //deberia funcionar si le paso los valores que le paso en el metodo debajo, pero no hay manera
                //filtro_hoteles();
                System.out.println("registros añadidos correctamente");
            case 6:
                try {
                    imprimirArrayList();
                    System.out.println("se ha generado el documento txt");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case 7:
                try {
                    mostrarFichero();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                break;
            default:
                throw new IllegalStateException("ese numero no esta disponible, elija otro: " + menu);
        }


    }

    public static void crearBD() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS examen_tercera");
        stmt.executeUpdate("USE examen_tercera");
    }

    public static void crearTabla() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("USE examen_tercera");

        // Crear tablas
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS hotel (" +
                "id INT PRIMARY KEY, nombre VARCHAR(50), anyo_edificacion INT,direccion VARCHAR(100), ibi DOUBLE, m2 DOUBLE)");
    }

    public static void insertarRegistro() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "admin");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("USE examen_tercera");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un id");
        int id = Integer.parseInt(sc.next());
        System.out.println("Introduce un nombre");
        String nombre = sc.next();
        System.out.println("Introduce un año de edificacion");
        int anyo_edificacion = Integer.parseInt(sc.next());
        System.out.println("Introduce una direccion");
        String direccion = sc.next();
        System.out.println("Introduce el ibi");
        double ibi = Double.parseDouble(sc.next());
        System.out.println("Introduce los metros cuadrados");
        double m2 = Double.parseDouble(sc.next());
        System.out.println("acepta mascotas?");
        boolean mascotas = sc.hasNextBoolean();
        String query = "INSERT INTO hotel(id,nombre,anyo_edificacion,direccion,ibi,m2) " + "VALUES ('" + id + "', '" + nombre + "', '" + anyo_edificacion + "', '" + direccion + "', '" + ibi + "', '" + m2 + "', '"+ mascotas + "');";
        stmt.executeUpdate(query);
    }


    public static void filtro_hoteles(int id,String nombre,int anyo_edificacion,String direccion,double ibi,double m2,boolean isPetFriendly) throws SQLException {
        ArrayList<Hotel> hotelesmascotas = new ArrayList<>();
        if (isPetFriendly==true){
            Hotel nuevo = new Hotel(id, nombre, anyo_edificacion, direccion, ibi, m2,isPetFriendly);
            //hotelesmascotas.add(nuevo);
        }else{
            System.out.println("No se han encontrado hoteles que acepten mascotas");
        }
    }

    public static ArrayList<Hotel> imprimirArrayList() throws IOException {
        ArrayList<Hotel> hotelesmascotas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("listadehoteles.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] atributos = linea.split("#");
                System.out.println("Lista de hoteles que aceptan mascotas");
                    //hotelesmascotas.add(new Hotel(Integer.parseInt(atributos[0]), atributos[1],Integer.parseInt(atributos[2]),atributos[3],Double.parseDouble(atributos[4]),Double.parseDouble(atributos[5]),true));
                }
            return hotelesmascotas;
            }
    }
    public static void mostrarFichero() throws IOException{
        //no funciona debido a que no consigo crear correctamente el arraylist
        //System.out.println("El hotel"+ hotelesmascotas.getNombre + "se construyó en el año "+ hotelesmascotas.getAnyo_edificacion + "y esta situado en " + hotelesmascotas.getDireccion + "cuenta con " + hotelesmascotas.getM2);
    }

        }






    //apunto esto aqui como comentario para ir guiandome cuando creo tablas o añado valores
    //    public int id;
    //    public String nombre;
    //    public int anyo_edificacion;
    //    public String direccion;
    //    public double ibi;
    //    public double m2;
//esto es algo que he hecho mal pero creo que podria servirme mas tarde
//        try (BufferedWriter listado = new BufferedWriter(new FileWriter(infoHoteles))) {
//            for (Hotel hotel : hotelesmascotas) {
//                listado.write(hotel.getId() + "," + hotel.getNombre() + "," + hotel.getAnyo_edificacion()+ "," + hotel.getDireccion()+ "," + hotel.getIbi()+ "," + hotel.getM2());
//                listado.newLine();
//            }
// esto me servira mas tarde
//     public ArrayList<Hotel> hotelparamascotas(int id,String nombre,int anyo_edificacion,String direccion,double ibi,double m2,boolean isPetFriendly){
//        Hotel nuevo = new Hotel(id,nombre,anyo_edificacion,direccion,ibi,m2,isPetFriendly);
//        hotelparamascotas(nuevo);
//    }

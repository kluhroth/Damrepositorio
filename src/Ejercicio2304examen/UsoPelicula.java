package Ejercicio2304examen;
import java.util.Scanner;
import java.sql.SQLException;

public class UsoPelicula {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        Peliculas cartelera= new Peliculas();
        cartelera.crearTabla();
        cartelera.eliminarTabla();
        cartelera.crearTabla();

        System.out.println("introduce el nombre de la pelicula");
        String titulo =sc.nextLine();
        System.out.println("Introduce el genero");
        String genero = sc.nextLine().toUpperCase();
        System.out.println("introduce la fecha de estreno");
        int estreno = sc.nextInt();

        Pelicula peli1 = new Pelicula(titulo,genero,estreno);
        cartelera.crearPelicula(peli1);
        System.out.println("introduce el nombre de la pelicula");
        sc.nextLine();
        titulo =sc.nextLine();
        System.out.println("Introduce el genero");
        genero = sc.nextLine().toUpperCase();
        System.out.println("introduce la fecha de estreno");
        estreno = sc.nextInt();
        Pelicula peli2 = new Pelicula(titulo,genero,estreno);

        cartelera.crearPelicula(peli2);
        cartelera.eliminarPelicula(1);


    }
}

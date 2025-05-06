package Interfazcollection;
import java.util.Locale;
import java.util.Scanner;
import java.util.HashSet;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dime un texto");
        String texto = scanner.nextLine();
        texto.toLowerCase();
        String[] palabras = texto.split(" ");
        int total= palabras.length;

        HashSet<String> distintas = new HashSet<>();

        for (String palabra : palabras) {
            distintas.add(palabra);
        }


        System.out.println("tiene un total de " + total + " palabras");
        System.out.println("y un total de " + distintas.size()+ " palabras distintas");

    }
}



package EjerciciosListas;
import java.util.*;
import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>(Arrays.asList("ALEMANIA","FRANCIA","JAPON","PORTUGAL","ESPAÑA","RUSIA","POLONIA","SUIZA","ANDORRA","CROACIA"));
        ArrayList<String> paisesencontrados = new ArrayList<>();
        boolean acierto=false;
        System.out.println("Adivina el pais");
        Scanner scanner = new Scanner(System.in);
        String eleccion = scanner.nextLine().toUpperCase();
        for (int i = 0; i < paises.size(); i++) {
            if (eleccion.equals(paises.get(i))) {
                System.out.println("El país está en la lista.");
                acierto = true;
                paisesencontrados.add(eleccion);

                break;
            }
        }

        if (!acierto) {
            System.out.println("El país no está en la lista.");
        }
        System.out.println(paisesencontrados.toString());
        }



    }



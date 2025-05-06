package Ejercicio4FrecuenciaPalabras;
import java.util.*;
public class FrecuenciaPalabras {
    public static void main(String[] args) {
        String frase = "hola gente y hola grupo";
        String [] palabras = frase.split(" ");
        System.out.println(Arrays.deepToString(palabras));
        for (int i=0;i<palabras.length;i++){

        }
        HashMap<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras) {
            if (frecuencia.containsKey(palabra)) {
                frecuencia.put(palabra, frecuencia.get(palabra) + 1);
            } else {
                frecuencia.put(palabra, 1);
            }
        }

        frecuencia.forEach((a, b) -> System.out.println("La palabra: " + a + " se repite " + b+ " veces"));
    }
}


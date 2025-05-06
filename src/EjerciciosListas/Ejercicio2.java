package EjerciciosListas;
import java.util.*;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        int contador=0;
        ArrayList<Integer> numale = new ArrayList<>();
        while (contador<20){
            int numero = (int) (Math.random()*10)+1;
            numale.add(numero);
            contador++;
        }
        System.out.println(numale.toString());


    }
}

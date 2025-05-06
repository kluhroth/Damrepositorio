package Interfazcollection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {
        int contador =1;
        TreeSet<Integer> numeros = new TreeSet<>();
        HashSet<Integer> numerospares = new HashSet<>();
        HashSet<Integer> numerosimpares = new HashSet<>();
        while (contador<21){
            if (contador % 2 == 0){
                numerospares.add(contador);
                numeros.add(contador);
                contador++;


            }else{
                numerosimpares.add(contador);
                numeros.add(contador);
                contador++;


            }
        }
        System.out.println(numerospares);
        System.out.println(numerosimpares);
        System.out.println(numeros);
    }
}

package Interfazcollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

                HashSet<String> nombres = new HashSet<>();
                Scanner scanner = new Scanner(System.in);
                int contador= 0;

                System.out.println("Introduce 10 nombres:");
                while (contador<10){
                    String nombre = scanner.nextLine().toUpperCase();
                    nombres.add(nombre);
                    contador++;
                    System.out.println(contador);

                }
        Iterator<String> itr= nombres.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

            }
        }




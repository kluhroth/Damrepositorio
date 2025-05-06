package EjerciciosListas;
import java.util.*;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        boolean existe=false;
        nombres.add("Miguel");
        nombres.add("David");
        nombres.add("Antonio");
        System.out.println("dime un nombre para buscar");
        String buscar = scanner.nextLine();

        for (int i=0;i<nombres.size();i++){
            if (buscar.equals(nombres.get(i))){
                existe= true;
            }
        }
            if ( existe==true){
                int posicion = nombres.indexOf(buscar);
                System.out.println("el nombre "+ buscar + "esta en la posicion " + posicion);

            }
            else if(existe ==false){
                System.out.println("el nombre no esta en la lista");
            }





        }
    }


package EjercicioLibre2204;
import java.util.*;
import java.io.*;
/*
La idea de mi codigo es tener una empresa(una discografica) y la idea es que vaya *contratando* cantantes
usamos un Arraylist porque no nos preocupa el orden, su ArrayList estara dentro de Empresa, y desde aqui lo llamaremos,
luego usaremos el metodo(que tambien esta en empresa,desde el main solo lo llamamos) guardarenarchivo, para que nos genere
un archivo txt donde nos va a guardar a los cantantes,por ultimo,
 */
public class UsoCantante extends Empresa {
    public static void main(String[] args) {
        Empresa discografica = new Empresa();
        discografica.contratarCantantes("Eminem", "Rap", 59);
        discografica.contratarCantantes("Bad Bunny", "Reggaeton", 30);
        discografica.contratarCantantes("Duki", "Rap", 25);

        for (Cantante cantantes : discografica.listaCantantes) {
            System.out.println(cantantes);
        }
        discografica.guardarEnArchivo("src/EjercicioLibre2204/ListaDeCantantesContratados.txt");






    }
}

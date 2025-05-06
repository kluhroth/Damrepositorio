package EjerciciosListas;
import java.util.*;
public class Ejercicio4resuelto {
        public static void main(String[] args) {
            // Lista de países secretos
            Set<String> paisesSecretos = new HashSet<>(Arrays.asList(
                    "ALEMANIA", "FRANCIA", "JAPON", "PORTUGAL", "ESPAÑA",
                    "RUSIA", "POLONIA", "SUIZA", "ANDORRA", "CROACIA"));

            // Lista para almacenar los aciertos consecutivos
            List<String> aciertosConsecutivos = new ArrayList<>();
            // Set para almacenar los países acertados en total
            Set<String> paisesAdivinados = new HashSet<>();

            Scanner scanner = new Scanner(System.in);
            int intentos = 0;

            System.out.println("¡Adivina los 10 países secretos!");

            while (paisesAdivinados.size() < 10) {
                System.out.print("Introduce un país: ");
                String eleccion = scanner.nextLine().toUpperCase();
                intentos++;

                if (paisesSecretos.contains(eleccion)) {
                    if (!paisesAdivinados.contains(eleccion)) {
                        paisesAdivinados.add(eleccion);
                        aciertosConsecutivos.add(eleccion);
                        System.out.println("¡Correcto! Países acertados seguidos: " + aciertosConsecutivos);
                    } else {
                        System.out.println("¡Ya adivinaste ese país antes! Sigue buscando.");
                    }
                } else {
                    System.out.println("Incorrecto, pierdes tu racha de aciertos. Vuelve a empezar.");
                    aciertosConsecutivos.clear(); // vacia la lista cuando fallas
                }
            }

            System.out.println("\n¡Felicidades! Has acertado los 10 países en " + intentos + " intentos.");
        }
    }


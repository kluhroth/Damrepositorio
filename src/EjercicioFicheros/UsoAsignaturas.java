package EjercicioFicheros;
import java.io.*;
import java.util.*;



public class UsoAsignaturas {
    public static void main(String[] args) throws NoFichero {
        // Alumno alumno1= new Alumno("48192834R","Juan",new String[]{"bd"});
        // Alumno alumno2= new Alumno("4883313F","Miguel",new Asignaturas[]{"bd"});

        Scanner sc = new Scanner(System.in);
        int opcion = 3;
        while (opcion != 0) {
            System.out.println("0.SALIR DEL PROGRAMA");
            System.out.println("1.leer archivo");
            System.out.println("2.escribir fichero");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("gracias por usar el programa");
                    break;
                case 1:
                    leerFichero();
                    break;
                case 2:
                    escribirFichero();
                    break;
                default:
                    System.out.println("Introduzca de nuevo la opcion");
            }
        }


    }

    //METODOS
    public static void leerFichero() throws NoFichero {
        Scanner sc = new Scanner(System.in);
        String nombreFichero;
        System.out.println("Introduce el nombre del fichero");
        nombreFichero = "src/EjercicioFicheros/" + sc.next() + ".txt";
        File file = new File(nombreFichero);
        if (!file.exists()) {
            throw new NoFichero("El fichero no existe");
        }
        if (file.length() == 0) {
            throw new NoFichero("El fichero esta vacio");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            String alumno[] = new String[0];

            while ((linea = reader.readLine()) != null) {
                alumno = linea.split(";");

                System.out.println("DNI: " + alumno[0]);
                System.out.println("nombre: " + alumno[1]);
                // if (alumno.length()>2){
                System.out.println("Asignaturas: " + alumno[2]);
                //  }
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void escribirFichero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu dni");
        String dni = sc.next();
        System.out.println("Dime tu nombre");
        String nombre = sc.next();
        System.out.println("cuantas asignaturas tiene?");
        int nAsig = sc.nextInt();
        Asignaturas asignaturas[] = new Asignaturas[nAsig];
        for (int i = 0; i < nAsig; i++) {
            System.out.println("dime la asignatura");
            asignaturas[i] = Asignaturas.valueOf(sc.next().toLowerCase());
        }
        Alumno alumno = new Alumno(dni, nombre, asignaturas);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/EjercicioFicheros/archivo.txt", true))) {
            writer.write(alumno.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
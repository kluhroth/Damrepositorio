package TemaFicheros;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {
        String fileName = "src/TemaFicheros/archivo.txt";

        // Escritura
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("hola, esto es una prueba.\nSegunda Linea.");
            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileReader reader = new FileReader(fileName)) {

            int character;

            if ((character = reader.read()) == -1) {
                throw new IllegalArgumentException("el fichero esta vacio");
            }
            System.out.print((char) character);
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

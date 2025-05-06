package TemaFicheros;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        String fileName = "src/TemaFicheros/archivo_buffer.txt";

        // Escritura con BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write("Primera Linea con Buffered Writer");
            writer.newLine();;
            writer.write("Segunda Linea.");
            System.out.println("Archivo escrito correctamente.");
        } catch(IOException e){
            e.printStackTrace();
        }
        // Lectura con BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

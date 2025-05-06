package TemaFicheros;
import java.io.*;
import java.io.File;

public class BufferedReaderWriteExample {
    public static void main(String[] args) {
        File fileName = new File ("src/TemaFicheros/archivo_buffer.txt");
        File directorio = new File("src/TemaFicheros/");
        System.out.println("Existe el fichero " + fileName.exists());
        System.out.println("El fichero es de longitud: "+fileName.length());
        System.out.println("Los archivos que hay dentro de ficheros son: ");
        for (int i=0;i<directorio.list().length;i++){
            System.out.println("- "+ directorio.list()[i]);
        }
        System.out.println("los archivos que hay dentro de los ficheros son ( obteniendo los nombres de los ficheros): ");
        for (int i=0;i<directorio.listFiles().length;i++){
            System.out.println("- " + directorio.listFiles()[i].getName());
        }

        System.out.println("El path del archivo archivoPrueba.txt es " + fileName.getPath());
        System.out.println("El nombre del padre del archivo es " +fileName.getParent());
    }
}

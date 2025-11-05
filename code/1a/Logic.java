import java.io.*;
import java.util.*;

public class Logic {

    // Se mueven las variables para que sean usadas por el método
    private int n = 0;
    private String data;
    private String[] arrData;
    private double media;
    private double desv;

    public Logic() {
    }

    // El método 'logical' ahora recibe el nombre del archivo a procesar
    public void logical(String nombreArchivo) {
        // 1. Crear instancias de las otras clases
        Input in = new Input();
        Data dat = new Data();
        Media med = new Media();
        DesvEst des = new DesvEst();
        OutPut out = new OutPut();

        try {
            // 2. Leer los datos del archivo
            data = in.readData(nombreArchivo);

            // 3. Convertir el string de datos en un array
            arrData = dat.saveData(data);
            n = arrData.length;

            // 4. Calcular la media
            media = med.getMedia(arrData, n);
            
            // 5. Calcular la desviación estándar
            desv = des.getDesvEst(media, arrData, n);

            // 6. Preparar el texto de salida
            // LÍNEA CORRECTA:
String resultado = "Cantidad de datos: " + n + 
                   "\nMedia = " + media + 
                   "\nDesviacion Estandar = " + desv;
            // 7. Imprimir el resultado en consola
            out.writeData(null, resultado); // (outFile es null, imprimimos en consola)

        } catch (IOException e) {
            System.out.println("ERROR: No se pudo leer el archivo " + nombreArchivo);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("ERROR: El archivo contiene datos que no son numeros.");
            e.printStackTrace();
        }
    }
}

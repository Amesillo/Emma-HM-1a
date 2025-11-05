import java.io.*;
import java.util.*;

public class App {

    public App() {
    }

    public static void main(String[] argv) {
        System.out.println("== Proyecto 1a - Media y Desviacion Estandar ==");

        // Llama a la clase Logica para empezar el programa
        Logic miLogica = new Logic();
        
        // Ejecuta la logica para el primer archivo de prueba
        System.out.println("\nProcesando in1.txt...");
        miLogica.logical("in1.txt");
        
        // Ejecuta la logica para el segundo archivo de prueba
        System.out.println("\nProcesando in2.txt...");
        miLogica.logical("in2.txt");
    }
}

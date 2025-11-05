import java.io.*;
import java.util.*;

public class Input {

    private String data;
    private BufferedReader br = null;

    public Input() {
    }

    // Lee el archivo y devuelve todo el contenido como un solo String
    public String readData(String inFile) throws IOException {
        StringBuilder sb = new StringBuilder();
        br = new BufferedReader(new FileReader(inFile));
        String linea;

        while ((linea = br.readLine()) != null) {
            sb.append(linea).append("\n"); // Añade cada número y un salto de línea
        }

        if (br != null) {
            br.close();
        }
        
        data = sb.toString().trim(); // .trim() quita el último salto de línea
        return data;
    }
}

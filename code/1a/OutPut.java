import java.io.*;
import java.util.*;

public class OutPut {

    public OutPut() {
    }

    // Imprime el texto. (Si outFile no es null, lo escribiría en un archivo)
    public void writeData(String outFile, String outText) {
        if (outFile != null) {
            // Lógica para escribir en un archivo (no la pide el proyecto)
            // ...
        } else {
            // Imprime en la consola
            System.out.println(outText);
        }
    }
}

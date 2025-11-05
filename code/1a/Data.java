import java.io.*;
import java.util.*;

/**
 * */
public class Data {

    public Data() {
    }

    // Convierte el String de "160\n591\n..." en un array ["160", "591", ...]
    public String[] saveData(String data) {
        if (data == null || data.isEmpty()) {
            return new String[0];
        }
        // Separa el string por cada salto de línea
        return data.split("\\s+"); // \\s+ significa "uno o más espacios/saltos"
    }
}

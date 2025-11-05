import java.io.*;
import java.util.*;

/**
 * */
public class Media {

    private double media;

    public Media() {
    }

    // Calcula la media (promedio)
    public double getMedia(String[] dataList, int n) throws NumberFormatException {
        if (n == 0) return 0.0;
        
        double suma = 0.0;
        for (String s : dataList) {
            suma += Double.parseDouble(s); // Convierte el String "160" a número 160.0
        }

        media = suma / n;
        return media;
    }
}

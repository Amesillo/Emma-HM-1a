import java.io.*;
import java.util.*;

public class DesvEst {

    public DesvEst() {
    }

    // Calcula la desviación estándar
    // (Tu diapositiva 38 dice n: double, pero es más común n: int)
    public double getDesvEst(double media, String[] dataList, int n) throws NumberFormatException {
        if (n == 0) return 0.0;
        
        double sumatoria = 0.0;
        for (String s : dataList) {
            double valor = Double.parseDouble(s);
            // Suma de los cuadrados de la diferencia de cada valor y la media
            sumatoria += Math.pow(valor - media, 2);
        }
        
        // (Suma / (n-1)) y luego raíz cuadrada
        return Math.sqrt(sumatoria / (n - 1));
    }
}

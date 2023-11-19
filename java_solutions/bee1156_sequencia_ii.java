//Walber Araújo 18/11/2023

import java.util.Locale;

public class bee1156_sequencia_ii {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double s = 1.0;
        double numerador = 3.0;
        double denominador = 2.0;

        for (;numerador <= 39.0; numerador += 2.0) {
            s += numerador / denominador;
            denominador *= 2.0;
        }

        System.out.printf("%.2f%n", s);
    }
}
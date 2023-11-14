//Walber Araújo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1060_numeros_positivos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        byte positivos = 0;

        for (byte i = 0; i < 6; i++) {
            double x = sc.nextDouble();
            if (x > 0) {
                positivos++;
            }
        }
        System.out.println(positivos + " valores positivos");
        sc.close();
    }
}
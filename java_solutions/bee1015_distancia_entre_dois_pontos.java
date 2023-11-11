// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1015_distancia_entre_dois_pontos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.printf("%.4f%n", distancia);
    }
}
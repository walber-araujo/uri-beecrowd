// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1002_area_do_circulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi, raio, area;

        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * (raio * raio);
        System.out.printf("A=%.4f%n", area);
    }
}

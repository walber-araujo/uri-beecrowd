// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1011_esfera {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();

        System.out.printf("VOLUME = %.3f%n", (4.0/3) * pi * Math.pow(raio, 3));
    }
}

// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1005_media_1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota_A, nota_B;

        nota_A = sc.nextDouble();
        nota_B = sc.nextDouble();
        System.out.printf("MEDIA = %.5f%n", (nota_A * 3.5 + nota_B * 7.5) / 11);
    }
}
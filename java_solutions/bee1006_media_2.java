// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1006_media_2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3;

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();
        System.out.printf("MEDIA = %.1f%n", (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10);
    }
}

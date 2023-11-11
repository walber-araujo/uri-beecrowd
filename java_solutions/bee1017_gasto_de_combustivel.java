// Walber Araújo 10/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1017_gasto_de_combustivel {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int tempo_Gasto = sc.nextInt();
        int velocidade_Media = sc.nextInt();

        System.out.printf("%.3f%n", (double) (velocidade_Media * tempo_Gasto) / 12);
    }
}
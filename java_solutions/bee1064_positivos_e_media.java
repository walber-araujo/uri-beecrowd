//Walber Araújo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1064_positivos_e_media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        byte qtd_Positivos = 0;
        float soma_Positivos = 0.0f;

        for (byte i = 0; i < 6; i++) {
            float x = sc.nextFloat();
            if (x > 0) {
                qtd_Positivos++;
                soma_Positivos += x;
            }
        }
        System.out.printf("%d valores positivos%n%.1f%n", qtd_Positivos,(float) (soma_Positivos / qtd_Positivos));
    }
}
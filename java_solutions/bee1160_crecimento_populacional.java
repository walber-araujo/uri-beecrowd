//Walber Araújo 18//11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1160_crecimento_populacional {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtd_Casos = sc.nextInt();

        for (; qtd_Casos > 0; qtd_Casos--) {
            int populacao_A = sc.nextInt();
            int populacao_B = sc.nextInt();
            float crec_A = sc.nextFloat();
            float crec_B = sc.nextFloat();
            byte qtd_Anos = 0;
            while (populacao_B >= populacao_A) {
                populacao_A += populacao_A * crec_A / 100.0;
                populacao_B += populacao_B * crec_B / 100.0;
                qtd_Anos++;
                if (qtd_Anos > 100) {
                    break;
                }
            }
            if (qtd_Anos > 100) {
                System.out.println("Mais de 1 seculo.");
            }
            else {
                System.out.printf("%d anos.%n", qtd_Anos);
            }

        }


    }
}

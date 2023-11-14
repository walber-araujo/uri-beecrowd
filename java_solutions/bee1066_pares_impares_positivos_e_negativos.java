//Walber Wesley 13/11/2023

import java.util.Scanner;

public class bee1066_pares_impares_positivos_e_negativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte qtd_Pares = 0;
        byte qtd_Impares = 0;
        byte qtd_Positivos = 0;
        byte qtd_Negativos = 0;

        for (byte i = 0; i < 5; i++) {
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                qtd_Pares++;
            }
            else {
                qtd_Impares++;
            }
            if (numero > 0) {
                qtd_Positivos++;
            }
            else if (numero < 0) {
                qtd_Negativos++;
            }
        }
        System.out.printf("%d valor(es) par(es)%n" +
                "%d valor(es) impar(es)%n" +
                "%d valor(es) positivo(s)%n" +
                "%d valor(es) negativo(s)%n", qtd_Pares, qtd_Impares, qtd_Positivos, qtd_Negativos);
        sc.close();
    }
}
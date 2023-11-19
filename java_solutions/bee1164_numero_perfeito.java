//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1164_numero_perfeito {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtd_Testes = sc.nextInt();

        for (; qtd_Testes > 0; qtd_Testes--) {
            int numero = sc.nextInt();
            int soma_Divisores = 0;
            for (int divisor = 1; numero / 2 >= divisor; divisor++) {
                if (numero % divisor == 0) {
                    soma_Divisores += divisor;
                }
            }
            if (soma_Divisores == numero) {
                System.out.println(numero + " eh perfeito");
            }
            else {
                System.out.println(numero + " nao eh perfeito");
            }
        }
    }
}
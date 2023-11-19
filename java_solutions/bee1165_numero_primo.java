//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1165_numero_primo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtd_Testes = sc.nextInt();

        for (; qtd_Testes > 0; qtd_Testes--) {
            int numero = sc.nextInt();
            if (numero > 2 && numero % 2 == 0 || numero < 2) {
                System.out.println(numero + " nao eh primo");
                continue;
            }

            boolean eh_primo = true;
            for (int divisor = 3; numero / 2 > divisor; divisor++) {
                if (numero % divisor == 0){
                    System.out.println(numero + " nao eh primo");
                    eh_primo = false;
                    break;
                }
            }

            if (eh_primo) {
                System.out.println(numero + " eh primo");
            }
        }
    }
}
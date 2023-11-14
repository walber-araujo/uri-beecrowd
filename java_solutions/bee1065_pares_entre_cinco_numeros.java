//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1065_pares_entre_cinco_numeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte qtd_pares = 0;

        for (byte i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                qtd_pares++;
            }
        }
        System.out.println(qtd_pares + " valores pares");
        sc.close();
    }
}
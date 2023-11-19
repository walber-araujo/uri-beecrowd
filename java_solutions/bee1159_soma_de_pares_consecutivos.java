//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1159_soma_de_pares_consecutivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int soma = 0;
            int x = sc.nextInt();

            if (x == 0) {
                break;
            }

            if (x % 2 != 0) {
                x++;
            }

            for (int i = 0; i < 5; i++) {
                soma += x;
                x += 2;
            }

            System.out.println(soma);
        }
    }
}
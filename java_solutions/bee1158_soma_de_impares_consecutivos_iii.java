//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1158_soma_de_impares_consecutivos_iii {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (; n > 0; n--) {
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x % 2 == 0) {
                x++;
            }

            for (; y > 0; y--) {
                soma += x;
                x += 2;
            }
            System.out.println(soma);
        }
    }
}
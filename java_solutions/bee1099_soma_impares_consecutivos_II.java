//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1099_soma_impares_consecutivos_II {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;
            if (x > y) {
                int aux = y;
                y = x;
                x = aux;
            }
            x++;
            while (x < y) {
                if (x % 2 == 1) {
                    soma += x;
                }
                x++;
            }
            System.out.println(soma);
        }
    }
}
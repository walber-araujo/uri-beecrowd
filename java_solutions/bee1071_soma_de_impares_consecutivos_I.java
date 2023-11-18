//Walber Araújo 14/11/2023

import java.util.Scanner;

public class bee1071_soma_de_impares_consecutivos_I {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;
        int aux;

        if (y > x) {
            aux = x;
            x = y;
            y = aux;
        }

        if (y % 2 == 0) {
            y++;
        }
        else {
            y += 2;
        }

        while (x > y) {
            soma += y;
            y += 2;
        }

        System.out.println(soma);
        sc.close();
    }
}
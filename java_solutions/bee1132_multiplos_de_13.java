//Walber Araújo 17/11/2023

import java.util.Scanner;

public class bee1132_multiplos_de_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int aux;
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
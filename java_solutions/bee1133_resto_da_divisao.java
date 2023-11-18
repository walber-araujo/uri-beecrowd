//Walber Araújo 17/11/2023

import java.util.Scanner;

public class bee1133_resto_da_divisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aux;
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            aux = x;
            x = y;
            y = aux;
        }
        for (int i = x + 1; i < y ; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
    }
}
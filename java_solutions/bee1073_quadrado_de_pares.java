//Walber Araújo 14/11/2023

import java.util.Scanner;

public class bee1073_quadrado_de_pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 1) {
            n--;
        }

        for (int i = 2; i <= n; i +=2) {
            System.out.printf("%d^2 = %d%n", i, i*i);
        }
    }
}
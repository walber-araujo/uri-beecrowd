//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1149_somando_inteiros_consecutivos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int soma = 0;

        while (n <= 0) {
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma += i + a;
        }

        System.out.println(soma);
    }
}

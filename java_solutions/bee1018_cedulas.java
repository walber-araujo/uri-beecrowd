// Walber Araújo 10/11/2023

import java.util.Scanner;

public class bee1018_cedulas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();

        System.out.println(valor);

        int n100 = valor / 100;
        valor -= n100 * 100;
        int n50 = valor / 50;
        valor -= n50 * 50;
        int n20 = valor / 20;
        valor -= n20 * 20;
        int n10 = valor / 10;
        valor -= n10 * 10;
        int n5 = valor / 5;
        valor -= n5 * 5;
        int n2 = valor / 2;
        valor -= n2 * 2;

        System.out.printf("%d nota(s) de R$ 100,00%n" +
                "%d nota(s) de R$ 50,00%n" +
                "%d nota(s) de R$ 20,00%n" +
                "%d nota(s) de R$ 10,00%n" +
                "%d nota(s) de R$ 5,00%n" +
                "%d nota(s) de R$ 2,00%n" +
                "%d nota(s) de R$ 1,00%n", n100, n50, n20, n10, n5, n2, valor);
    }
}
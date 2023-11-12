// Walber Araújp 11/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1021_notas_e_moedas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        int n100 = (int) valor / 100;
        valor -= n100 * 100;
        int n50 = (int) valor / 50;
        valor -= n50 * 50;
        int n20 = (int) valor / 20;
        valor -= n20 * 20;
        int n10 = (int) valor / 10;
        valor -= n10 * 10;
        int n5 = (int) valor / 5;
        valor -= n5 * 5;
        int n2 = (int) valor / 2;
        valor -= n2 * 2;

        valor *= 100;

        int m1 = (int) valor / 100;
        valor -= m1 * 100;
        int m50 = (int) (valor / 50);
        valor -= m50 * 50;
        int m25 = (int) (valor / 25);
        valor -= m25 * 25;
        int m10 = (int) (valor / 10);
        valor -= m10 * 10;
        int m05 = (int) (valor / 5);
        valor -= m05 * 5;
        int m01 = (int) valor;

        System.out.printf("NOTAS:%n" +
                "%d nota(s) de R$ 100.00%n" +
                "%d nota(s) de R$ 50.00%n" +
                "%d nota(s) de R$ 20.00%n" +
                "%d nota(s) de R$ 10.00%n" +
                "%d nota(s) de R$ 5.00%n" +
                "%d nota(s) de R$ 2.00%n" +
                "MOEDAS:%n" +
                "%d moeda(s) de R$ 1.00%n" +
                "%d moeda(s) de R$ 0.50%n" +
                "%d moeda(s) de R$ 0.25%n" +
                "%d moeda(s) de R$ 0.10%n" +
                "%d moeda(s) de R$ 0.05%n" +
                "%d moeda(s) de R$ 0.01%n", n100, n50, n20, n10, n5, n2, m1, m50, m25, m10, m05, m01);
    }
}
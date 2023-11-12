// Walber Araújo 11/11/2023

import java.util.Scanner;
import java.util.Locale;

public class bee1038_lanche {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor = 0;

        switch (codigo) {
            case 1 -> valor = quantidade * 4.0;
            case 2 -> valor = quantidade * 4.5;
            case 3 -> valor = quantidade * 5.0;
            case 4 -> valor = quantidade * 2.0;
            case 5 -> valor = quantidade * 1.5;
        }
        System.out.printf("Total: R$ %.2f%n", valor);
    }
}
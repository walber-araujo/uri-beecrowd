// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1010_calculo_simples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo_Peca1 = sc.nextInt();
        int qtd_Pecas1 = sc.nextInt();
        double valor_Unitario_Peca1 = sc.nextDouble();
        sc.nextLine();
        int codigo_Peca2 = sc.nextInt();
        int qtd_Pecas2 = sc.nextInt();
        double valor_Unitario_Peca2 = sc.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", qtd_Pecas1 * valor_Unitario_Peca1 + qtd_Pecas2 * valor_Unitario_Peca2);
    }
}
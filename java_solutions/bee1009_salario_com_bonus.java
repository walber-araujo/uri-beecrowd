// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1009_salario_com_bonus {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario, vendas, total;

        nome = sc.nextLine();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();
        total = ((vendas * 15) / 100) + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
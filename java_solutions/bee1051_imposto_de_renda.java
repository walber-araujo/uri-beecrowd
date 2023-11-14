//Walber Araújo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1051_imposto_de_renda {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double acima_4500 = 0;
        double entre_3k_E_4500 = 0;
        double entre_2k_E_3k = 0;

        if (salario > 4500.00) {
            acima_4500 = salario - 4500;
            salario -= acima_4500;
        }
        if (salario > 3000.00) {
            entre_3k_E_4500 = salario - 3000.00;
            salario -= entre_3k_E_4500;
        }
        if (salario > 2000.0) {
            entre_2k_E_3k = salario - 2000.0;
            System.out.printf("R$ %.2f%n", acima_4500 * 0.28 + entre_3k_E_4500 * 0.18 + entre_2k_E_3k * 0.08);
        }
        else {
            System.out.println("Isento");
        }
    }
}
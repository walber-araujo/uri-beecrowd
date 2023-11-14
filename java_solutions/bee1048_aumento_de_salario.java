//Walber Araújo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1048_aumento_de_salario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double novo_salario;
        String percentual_reajuste;

            if (salario <= 400.00) {
                novo_salario = salario * 1.15;
                percentual_reajuste = "15 %";
            }
            else if (salario <= 800.00)  {
                novo_salario = salario * 1.12;
                percentual_reajuste = "12 %";
            }
            else if (salario <= 1200.00)  {
                novo_salario = salario * 1.10;
                percentual_reajuste = "10 %";
            }
            else if (salario <= 2000.00)  {
                novo_salario = salario * 1.07;
                percentual_reajuste = "7 %";
            }
            else  {
                novo_salario = salario * 1.04;
                percentual_reajuste = "4 %";
            }

        System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %s%n", novo_salario, novo_salario - salario, percentual_reajuste);
    }
}

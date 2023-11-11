// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1008_salario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num_funcionario, qtd_horas;
        double valor_por_hora;

        num_funcionario = sc.nextInt();
        qtd_horas = sc.nextInt();
        valor_por_hora = sc.nextDouble();
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", num_funcionario, qtd_horas * valor_por_hora);
    }
}
//Walber Araújo 17/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1118_varias_notas_com_validacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int confirma;

        do {
            byte qtd_Notas_Validas = 0;
            float soma = 0;

            while (qtd_Notas_Validas < 2) {
                float nota = sc.nextFloat();
                if (nota >= 0.0 && nota <= 10.0) {
                    qtd_Notas_Validas++;
                    soma += nota;
                }
                else {
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f%n", soma / 2.0);
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                confirma = sc.nextInt();
            } while (confirma != 1 && confirma != 2);

        } while(confirma == 1);
    }
}
//Walber Araújo 16/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1117_validacao_de_nota {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float media = 0;
        byte qtd_Notas_Validas = 0;

        while (qtd_Notas_Validas < 2) {
            float nota = sc.nextFloat();
            if (nota >= 0.0 && nota <= 10.0) {
                qtd_Notas_Validas++;
                media += nota;
            }
            else {
                System.out.println("nota invalida");
            }
        }
        System.out.printf("media = %.2f%n", media / 2.0);
    }
}
// Walber Araújo 11/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1040_media3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        double media = (int) (nota1*2 + nota2*3 + nota3*4 + nota4) / 10.0;

        System.out.printf("Media: %.1f%n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");
            double nota_Exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", nota_Exame);
            double media_Final = (int) ((media + nota_Exame) * 10) / 20.0;

            if (media_Final >= 5.0) {
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media_Final);
        }
    }
}
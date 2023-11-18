//Walber Araújo 16/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1094_experiencias {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        int qtd_Coelhos = 0;
        int qtd_Sapos = 0;
        int qtd_Ratos = 0;

        for (int i = 0; i < n; i++) {
            byte qtd = sc.nextByte();
            String animal = sc.nextLine();
            if (animal.equals(" C")) {
                qtd_Coelhos += qtd;
            }
            else if (animal.equals(" R")) {
                qtd_Ratos += qtd;
            }
            else {
                qtd_Sapos += qtd;
            }
            total += qtd;
        }
        System.out.printf("Total: %d cobaias%nTotal de coelhos: %d%nTotal de ratos: %d%n" +
                "Total de sapos: %d%nPercentual de coelhos: %.2f %%%n" +
                "Percentual de ratos: %.2f %%%nPercentual de sapos: %.2f %%%n",
                total, qtd_Coelhos, qtd_Ratos, qtd_Sapos, (qtd_Coelhos * 100.0) / total,
                (qtd_Ratos * 100.0) / total, (qtd_Sapos * 100.0) / total);
    }
}
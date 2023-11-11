// Walber Araújo 10/11/2023

import java.util.Scanner;

public class bee1020_idade_em_dias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int idade_Em_Dias = sc.nextInt();
        int anos = idade_Em_Dias / 365;
        int meses = (idade_Em_Dias % 365) / 30;
        int dias = (idade_Em_Dias % 365) % 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);
        sc.close();
    }
}
//Walber Araújo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1042_sort_simples {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int maior, menor, intermediario;

        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
            if (num2 <= num3) {
                intermediario = num3;
                menor = num2;
            }
            else {
                intermediario = num2;
                menor = num3;
            }
        }
        else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
            if (num1 <= num3) {
                menor = num1;
                intermediario = num3;
            }
            else {
                menor = num3;
                intermediario = num1;
            }
        }
        else {
            maior = num3;
            if (num1 <= num2) {
                menor = num1;
                intermediario = num2;
            }
            else {
                menor = num2;
                intermediario = num1;
            }
        }
        System.out.printf("%d%n%d%n%d%n%n%d%n%d%n%d%n", menor, intermediario, maior, num1, num2, num3);
    }
}
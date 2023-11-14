//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1067_numeros_impares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int num_Impar = 1; num_Impar <= x; num_Impar +=2) {
            System.out.println(num_Impar);
        }
    }
}
//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1153_fatorial_simples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        int fatorial = 1;

        for (int i = n; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
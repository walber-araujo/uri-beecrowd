//Walber Araújo 14/11/2023

import java.util.Scanner;

public class bee1070_seis_numeros_impares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            x++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2;
        }

        sc.close();
    }
}
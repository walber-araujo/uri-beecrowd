//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1059_numeros_pares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int n = 2; n <= 100; n += 2) {
            System.out.println(n);
        }
        sc.close();
    }
}
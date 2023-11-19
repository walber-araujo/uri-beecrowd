//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1144_sequencia_logica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int i_Ao_Quadrado = i * i;
            System.out.printf("%d %d %d%n%d %d %d%n", i, i_Ao_Quadrado, i_Ao_Quadrado * i, i, i_Ao_Quadrado + 1, i_Ao_Quadrado * i + 1);
        }
    }
}
//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1101_sequencia_de_numeros_e_soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n, aux;
        while (true) {
            m = sc.nextInt();
            n = sc.nextInt();
            if (m <= 0 || n <= 0) {
                break;
            }
            if (n > m) {
                aux = n;
                n = m;
                m = aux;
            }
            int soma = 0;
            while (n <= m) {
                System.out.print(n + " ");
                soma += n;
                n++;
            }
            System.out.printf("Sum=%d%n", soma);
        }
    }
}
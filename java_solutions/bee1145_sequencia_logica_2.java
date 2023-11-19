//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1145_sequencia_logica_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i = 0;

        while (i <= y) {
            for (int c = 0; c < x; c++) {
                i++;
                if (i > y) {
                    break;
                }

                if (c == x - 1) {
                    System.out.println(i);
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
}
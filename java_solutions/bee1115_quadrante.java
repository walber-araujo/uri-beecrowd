//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1115_quadrante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;

        do {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        } while (x != 0 && y != 0);
    }
}
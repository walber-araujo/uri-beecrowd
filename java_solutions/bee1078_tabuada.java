//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1078_tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();

        for (byte i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", i, n, i*n);
        }
    }
}
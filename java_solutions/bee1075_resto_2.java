//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1075_resto_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();

        for (short i = 1; i <= 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }
        }
    }
}
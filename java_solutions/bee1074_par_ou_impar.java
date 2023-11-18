//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1074_par_ou_impar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 0) {
                System.out.println("NULL");
            }
            else if (x % 2 == 0) {
                System.out.print("EVEN ");
            }
            else {
                System.out.print("ODD ");
            }

            if (x > 0) {
                System.out.println("POSITIVE");
            }
            else if (x < 0) {
                System.out.println("NEGATIVE");
            }
        }
    }
}
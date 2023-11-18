//Walber Araújo 16/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1116_dividindo_x_por_y {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                System.out.printf("%.1f%n", (double) x / y);
            }
        }
    }
}
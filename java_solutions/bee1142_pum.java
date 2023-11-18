//Walber Araújo 17/11/2023

import java.util.Scanner;

public class bee1142_pum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            x++;
            System.out.print(x + " ");
            x++;
            System.out.print(x + " ");
            System.out.println("PUM");
            x += 2;
        }
    }
}
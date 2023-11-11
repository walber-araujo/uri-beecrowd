// Walber Araújo 09/11/2023

import java.util.Scanner;

public class bee1007_diferenca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        System.out.printf("DIFERENCA = %d%n", a * b - c * d);
    }
}
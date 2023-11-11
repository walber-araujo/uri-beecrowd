// Walber Araújo 10/11/2023

import java.util.Scanner;
import java.util.Locale;

public class bee1036_formula_de_bhaskara {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = (Math.pow(b, 2) - 4 * a * c);
        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            System.out.printf("R1 = %.5f%nR2 = %.5f%n", (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a));
        }
    }
}
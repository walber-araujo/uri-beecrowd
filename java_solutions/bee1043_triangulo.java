//Walber Arapujo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1043_triangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();

        if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2) {
            System.out.printf("Perimetro = %.1f%n", lado1 + lado2 + lado3);
        }
        else {
            System.out.printf("Area = %.1f%n", (lado1 + lado2) * lado3 / 2);
        }
    }
}
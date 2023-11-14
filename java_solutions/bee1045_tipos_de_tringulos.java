//Walber Araújo 13/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1045_tipos_de_tringulos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double aux;

        if (B > A && B > C){
            aux = A;
            A = B;
            B = aux;
        }
        else if (C > A) {
            aux = A;
            A = C;
            C = aux;
        }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            double B_C_2 = Math.pow(B, 2) + Math.pow(C, 2);
            if (Math.pow(A, 2) == B_C_2) {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (Math.pow(A, 2) > B_C_2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (Math.pow(A, 2) < B_C_2) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && A == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
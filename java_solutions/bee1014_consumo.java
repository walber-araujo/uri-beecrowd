// Walber Araújo 09/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1014_consumo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int distancia_Percorrida = sc.nextInt();
        double combustivel_Gasto = sc.nextDouble();

        System.out.printf("%.3f km/l%n", distancia_Percorrida / combustivel_Gasto);
    }
}
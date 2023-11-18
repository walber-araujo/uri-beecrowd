//Walber Araújo 16/11/2023

import java.util.Locale;
import java.util.Scanner;

public class bee1079_medias_ponderadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            float x = sc.nextFloat();
            float y = sc.nextFloat();
            float z = sc.nextFloat();
            System.out.printf("%.1f%n", (x*2 + y*3 + z*5) / 10.0);
        }
    }
}
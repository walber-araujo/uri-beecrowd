//Walber Araújo 14/11/2023

import java.util.Scanner;

public class bee1072_intervalo_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dentro_Do_Intervalo = 0;
        int fora_Do_Intervalo = 0;

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                dentro_Do_Intervalo++;
            }
            else {
                fora_Do_Intervalo++;
            }
        }

        System.out.printf("%d in%n%d out%n", dentro_Do_Intervalo, fora_Do_Intervalo);
        sc.close();
    }
}
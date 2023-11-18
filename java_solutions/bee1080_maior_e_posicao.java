//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1080_maior_e_posicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maior = 0;
        byte i_maior = 1;
        for (byte i = 1; i <= 100; i++) {
            int num = sc.nextInt();
            if (num > maior) {
                maior = num;
                i_maior = i;
            }
        }
        System.out.println(maior + "\n" + i_maior);
    }
}
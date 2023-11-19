//Walber Araújo 18/11/2023

import java.util.Scanner;

public class bee1150_ultrapassando_z {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        int soma = 0;
        int qtd_Numeros = 0;

        while (z <= x) {
            z = sc.nextInt();
        }

        while (soma <= z) {
            soma += qtd_Numeros + x;
            qtd_Numeros++;
        }

        System.out.println(qtd_Numeros);
    }
}
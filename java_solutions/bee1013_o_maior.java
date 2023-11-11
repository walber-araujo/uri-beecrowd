// Walber Araújo 09/11/2023

import java.util.Scanner;

public class bee1013_o_maior {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maiorAB = (a + b + Math.abs(a-b)) / 2;
        int maior_Geral = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maior_Geral + " eh o maior");
    }
}
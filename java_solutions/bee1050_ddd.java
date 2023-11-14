//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1050_ddd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte ddd = sc.nextByte();
        String cidade = switch (ddd) {
            case 11 -> "Sao Paulo";
            case 19 -> "Campinas";
            case 21 -> "Rio de Janeiro";
            case 27 -> "Vitoria";
            case 31 -> "Belo Horizonte";
            case 32 -> "Juiz de Fora";
            case 61 -> "Brasilia";
            case 71 -> "Salvador";
            default -> "DDD nao cadastrado";
        };
        System.out.println(cidade);
    }
}
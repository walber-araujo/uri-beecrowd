//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1052_mes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte mes = sc.nextByte();
        String nome_mes = switch (mes) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            default -> "December";
        };
        System.out.println(nome_mes);
    }
}
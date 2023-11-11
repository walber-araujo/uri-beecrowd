// Walber Araújo 10/11/2023

import java.util.Scanner;

public class bee1019_conversao_de_tempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tempo_Segundos = sc.nextInt();

        int horas = tempo_Segundos / 3600;
        System.out.printf("%d:", horas);

        int minutos = (tempo_Segundos - horas * 3600) / 60;
        System.out.printf("%d:", minutos);

        int segundos = (tempo_Segundos - horas * 3600 - minutos * 60);
        System.out.printf("%d%n", segundos);
    }
}
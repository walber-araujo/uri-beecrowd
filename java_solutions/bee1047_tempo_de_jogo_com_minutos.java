//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1047_tempo_de_jogo_com_minutos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora_inicial = sc.nextInt();
        int minuto_inicial = sc.nextInt();
        int hora_final = sc.nextInt();
        int minuto_final = sc.nextInt();
        int duracao_hora, duracao_minuto;

        if (hora_inicial == hora_final) {
            duracao_hora = 24;
        } else if (hora_inicial > hora_final) {
            duracao_hora = 24 - hora_inicial + hora_final;
        } else {
            duracao_hora = hora_final - hora_inicial;
        }

        if (minuto_inicial == minuto_final) {
            duracao_minuto = 0;
        } else if (minuto_inicial > minuto_final) {
            duracao_minuto = 60 - minuto_inicial + minuto_final;
            duracao_hora -= 1;
        } else {
            duracao_minuto = minuto_final - minuto_inicial;
            if (duracao_hora == 24) {
                duracao_hora = 0;
            }
        }

        System.out.println("O JOGO DUROU " + duracao_hora + " HORA(S) E " + duracao_minuto + " MINUTO(S)");
    }
}
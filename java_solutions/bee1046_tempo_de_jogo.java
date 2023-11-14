//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1046_tempo_de_jogo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora_inicial = sc.nextInt();
        int hora_final = sc.nextInt();
        int duracao;

        if (hora_inicial == hora_final) {
            duracao = 24;
        }
        else if (hora_inicial > hora_final) {
            duracao = 24 - hora_inicial + hora_final;
        }
        else {
            duracao = hora_final - hora_inicial;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
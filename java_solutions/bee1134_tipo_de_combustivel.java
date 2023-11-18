//Walber Araújo 17/11/2023

import java.util.Scanner;

public class bee1134_tipo_de_combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int qtd_Alcool = 0;
        int qtd_Gasolina = 0;
        int qtd_Diesel = 0;
        int tipo;

        do {
            tipo = sc.nextInt();
            if (tipo == 1) {
                qtd_Alcool++;
            }
            else if (tipo == 2) {
                qtd_Gasolina++;
            }
            else if (tipo == 3) {
                qtd_Diesel++;
            }
        } while(tipo != 4);

        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", qtd_Alcool, qtd_Gasolina, qtd_Diesel);
    }
}

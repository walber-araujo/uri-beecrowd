import java.util.Locale;
import java.util.Scanner;

public class bee1154_idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int soma_Idades = 0;
        int qtd_Idades_Validas = 0;

        while (true) {
            int idade = sc.nextInt();
            if (idade < 0) {
                break;
            }
            soma_Idades += idade;
            qtd_Idades_Validas++;
        }
        System.out.printf("%.2f%n", (double) soma_Idades / qtd_Idades_Validas);
    }
}
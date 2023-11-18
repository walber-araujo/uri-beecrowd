//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1114_senha_fixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senha = "2002";
        String tentativa;
        do {
            tentativa = sc.nextLine();
            if (! tentativa.equals(senha)) {
                System.out.println("Senha Invalida");
            }
        } while (!tentativa.equals(senha));
        System.out.println("Acesso Permitido");
    }
}
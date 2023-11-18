//Walber Araújo 16/11/2023

import java.util.Scanner;

public class bee1113_crescente_e_decrescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > y) {
                System.out.println("Decrescente");
            }
            else if (x < y){
                System.out.println("Crescente");
            }
        } while(x != y);
    }
}
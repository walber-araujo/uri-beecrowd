//Walber Araújo 13/11/2023

import java.util.Scanner;

public class bee1049_animal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra1 = sc.nextLine();
        String palavra2 = sc.nextLine();
        String palavra3 = sc.nextLine();
        String animal = "";

        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    animal = "aguia";
                }
                else {
                    animal = "pomba";
                }
            }
            else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    animal = "homem";
                }
                else {
                    animal = "vaca";
                }
            }
        }
        else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    animal = "pulga";
                }
                else {
                    animal = "lagarta";
                }
            }
            else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    animal = "sanguessuga";
                }
                else {
                    animal = "minhoca";
                }
            }
        }
        System.out.println(animal);
    }
}

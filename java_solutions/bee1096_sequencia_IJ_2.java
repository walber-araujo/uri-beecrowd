//Walber Araújo 16/11/2023

public class bee1096_sequencia_IJ_2 {
    public static void main(String[] args) {

        byte j = 7;
        byte i = 1;
        for (byte c = 1; c <= 15; c++) {
            System.out.printf("I=%d J=%d%n", i, j);
            j--;
            if (j < 5) {
                j = 7;
            }
            if (c % 3 == 0) {
                i += 2;
            }
        }
    }
}
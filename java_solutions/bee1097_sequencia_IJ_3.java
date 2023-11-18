//Walber Araújo 16/11/2023

public class bee1097_sequencia_IJ_3 {
    public static void main(String[] args) {

        byte i = 1;
        byte j = 7;
        for (byte c = 1; c <= 15; c ++) {
            System.out.printf("I=%d J=%d%n", i, j);
            j--;
            if (c % 3 == 0) {
                i += 2;
                j += 5;
            }
        }
    }
}
package ex03.ProgEx;

public class ProgEx05 {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (i + j == 6) {
                    System.out.printf("(%d, %d) ", i, j);
                }
            }
        }
    }
}

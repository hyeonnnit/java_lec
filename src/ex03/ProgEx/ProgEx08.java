package ex03.ProgEx;

public class ProgEx08 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                for (int k = 1; k < 101; k++) {
                    if (i*i+j*j==k*k) {
                        System.out.printf("%d, %d, %d\n", i, j ,k);
                    }
                }
            }
        }
    }
}

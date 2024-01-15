package ex.ex03;

public class GugudanEx01 {
    public static void main(String[] args) {

        for (int k = 2; k < 10 ; k++) {
            for (int i = 1; i < 10; i++) {
                int d = k * i;
                System.out.printf("%d * %d = %d ", k, i, d);
            }
            System.out.println();
        }
    }
}

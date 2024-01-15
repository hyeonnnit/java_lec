package ex.ex03;

public class GugudanEx02 {
    public static void main(String[] args) {

        for(int k = 1; k < 10; k++) {
            for (int i = 2; i < 10; i++) {
                int d=i*k;

                System.out.printf("%d * %d = %d\t", k, i ,d);
            }
            System.out.println();
        }
    }
}

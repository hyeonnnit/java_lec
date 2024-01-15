package ex.ex03.ProgEx;

public class ProgEx10 {
    public static void main(String[] args) {
        double [] s  = {1.0, 2.0, 3.0, 4.0};
        double sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = sum + s[i];
        }
        System.out.println(sum);

        double max = 0;
        for (int i = 0; i < 3; i++) {
            max = (s[i+1]>s[i]) ? s[i+1]: s[i];
            }
        System.out.println(max);
        }
    }


package ex.ex02;

public class ProgEx03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int sum = x + y;
        int minus = x - y;
        int multiply = x * y;
        double avg = (double) (x+y)/2;
        int max = (x>y) ? x: y;
        int min = (x<y) ? x: y;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(avg);
        System.out.println(max);
        System.out.println(min);
    }
}

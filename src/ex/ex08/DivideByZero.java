package ex.ex08;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        int result = 0;
        try {
            result = 10/num;
        } catch (Exception e) {
//            System.out.println("0으로 나누면 안돼요.");
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("나눗셈 결과: "+result);
    }
}

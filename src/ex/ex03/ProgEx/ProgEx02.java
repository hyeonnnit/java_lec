package ex.ex03.ProgEx;

import java.util.Scanner;

public class ProgEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연산 입력: ");
        String s = sc.next();

        System.out.print("피연산자 2개 입력: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (s.equals("+")){
            System.out.printf("%d + %d = %d", n1,n2,n1+n2);
        }else if (s.equals("-")){
            System.out.printf("%d - %d = %d", n1,n2,n1-n2);
        }else if (s.equals("*")){
            System.out.printf("%d * %d = %d", n1,n2,n1*n2);
        }else if (s.equals("/")){
            System.out.printf("%d / %d = %d", n1,n2,n1/n2);
        }else {
            System.out.println("Error");
        }
    }
}

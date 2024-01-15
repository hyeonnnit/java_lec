package bookEx.bookEx03;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        int grade = sc.nextInt();

        if (grade > 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        }else if (grade >= 60) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}

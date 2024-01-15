package bookEx.bookEx03;

import java.util.Scanner;

public class GetSumBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, value = 0;

        while (true){
            sum += value;
            System.out.print("정수입력: ");
            value = sc.nextInt();
            if (value == -1){
                break;
            }
        }
        System.out.println("sum is " + sum);
    }
}

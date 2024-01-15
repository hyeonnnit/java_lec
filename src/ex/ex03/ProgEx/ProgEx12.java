package ex.ex03.ProgEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        int num=0;
        ArrayList<Integer> score = new ArrayList<>();
        while (num != -1){
            count++;
            System.out.print("성적을 입력하세요: ");
            num = sc.nextInt();
            score.add(num);
            sum += num;


            if (num == -1){
                break;
            }
        }
        System.out.println("합계: " + (sum+1));
        System.out.println("평균: " + (sum+1)/(count-1));
    }
}

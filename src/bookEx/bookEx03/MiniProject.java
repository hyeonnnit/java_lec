package bookEx.bookEx03;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정답을 추측하여 보시오: ");
        int user = sc.nextInt();

        int answer = (int) (Math.random() * 50);
        int[]k = new int[5];
        int i = 0;
        while (i < 5) {
            k[i] = i;
            for (int j = 0; j < 1; j++) {
                if (answer == user) {
                    System.out.println("Right");
                } else if (answer < user) {
                    System.out.println("down");
                } else if (answer > user) {
                    System.out.println("up");
                } else {
                    System.out.println("error");
                }
            }
            i++;
            System.out.println();
        }
        System.out.println(answer);
    }
}

package ex03;

import java.util.Scanner;

public class GugudanEx03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("단: ");
        int num = sc.nextInt();

        int x;
        int i = 0;
        while (i<9){
            i++;
            x = num * i;
            System.out.printf("%d * %d = %d\n", num, i, x);
            }
        }
    }


package ex03.LottoTest;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();

        int num;


        num = r.nextInt(3)+1;
        arr[0] = num;


        while (true) {
            num = r.nextInt(3) + 1;
            if (arr[0] != num) {
                arr[1] = num;
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

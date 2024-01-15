package ex.ex03.LottoTest;

import java.util.Arrays;
import java.util.Random;


public class LottoEx04 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        for (int i = 0; i < 6; i++) {
            if (i==0){
                num = r.nextInt(45)+1;
                arr[i] = num;
                continue;
            }
           while (true){
               isSame = false;
               num = r.nextInt(45)+1;

               for (int j = i-1; j >= 0; j--) {
                   if(arr[j] == num){
                       isSame = true;
                       break;
                   }
               }
               if (!isSame){
                   arr[i] = num;
                   break;
               }
           }
        }
        System.out.println(Arrays.toString(arr));
    }
}

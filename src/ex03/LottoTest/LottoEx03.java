package ex03.LottoTest;

import java.util.Arrays;
import java.util.Random;


public class LottoEx03 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();

        int num;
        // 0과 비교가 안됨
        for (int i = 0; i < arr.length; i++) {
            if(i==0){
                num = r.nextInt(3)+1;
                arr[i] = num;
            }else {
                // 0이 안나오게 하는 로직
                while (true) {
                    num = r.nextInt(3) + 1;
                    if (arr[i-1] != num) {
                        arr[i] = num;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

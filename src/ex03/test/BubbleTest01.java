package ex03.test;

public class BubbleTest01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length; // 상수는 대문자로 구분

//        // 첫번째 - 4바퀴 돌기
//        for (int i = 0; i < N-1 ; i++) {
//            System.out.println("1");
//        }

        // 두번째 - 4바퀴 돌기, 내부적으로 4바퀴 돌기
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < N-1; j++) {
                System.out.println("1");
            }

        }
    }
}

package ex03;

public class BubbleEx01 {
    static void bubble(int[] arr){
        final int N = arr.length;

        int temp;
        for (int j = 0; j < N - 1; j++) {
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        // (BubbleEx01.) bubble(arr); 같은 클래스 안에 있으면 생략 가능
        bubble(arr);
        System.out.println();
        int[] arr2 = {5, 8, 2, 4, 3, 10, 500, 7, 6};
        bubble(arr2);
    }
}

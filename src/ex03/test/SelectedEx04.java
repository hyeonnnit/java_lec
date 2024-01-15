package ex03.test;

public class SelectedEx04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int rep;
        int min;
        for (int j = 0; j < 4; j++) {

        }
        //1회전
        rep = 0;
        min = rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }


        if (rep !=min){
            int temp = arr[rep];
            arr[rep] = arr[min];
            arr[min] = temp;
        }

        //2회전
        rep = 1;
        min = rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }


        if (rep !=min){
            int temp = arr[rep];
            arr[rep] = arr[min];
            arr[min] = temp;
        }

        //3회전
        rep = 2;
        min = rep;

        for (int i = rep+1; i < N; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }


        if (rep !=min){
            int temp = arr[rep];
            arr[rep] = arr[min];
            arr[min] = temp;
        }


    }

}

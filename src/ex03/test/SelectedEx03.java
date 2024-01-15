package ex03.test;

public class SelectedEx03 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        final int rep = 0;
        int min = rep;

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

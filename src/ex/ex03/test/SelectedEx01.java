package ex.ex03.test;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        //변경해야 될 위치 5 -> replace -> rep

        //변경해야 될 위치 2 -> min -> min
        final int rep = 0;
        int min = rep;

        if (arr[0] > arr[1]){
            min = 1;
        }  //5, 8, 2, 4, 3

        if (arr[0] > arr[2]){
            min = 2;
        }  //5, 8, 2, 4, 3 -> min = 2

        if (arr[2]> arr[3]) {
            min = 3;
        }  //5, 8, 2, 4, 3 -> min = 2

        if (arr[2]>arr[4]){
            min = 4;
        }

        if (rep !=min){
            int temp = arr[rep];  // temp = 5
            arr[rep] = arr[min];
            arr[min] = temp;
        }


    }

}

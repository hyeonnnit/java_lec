package ex.ex03.test;

public class SelectedEx02 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        final int rep = 0;
        int i = rep;
        int min = rep;

        i++; //1
        if (arr[min] > arr[i]){
            min = i;
        }
        i++; //2
        if (arr[min] > arr[i]){
            min = i; //2
        }
        i++; //3
        if (arr[min]> arr[i]) {
            min = i;
        }
        i++;  //4
        if (arr[min]>arr[i]){
            min = i;
        }

        if (rep !=min){
            int temp = arr[rep];
            arr[rep] = arr[min];
            arr[min] = temp;
        }


    }

}

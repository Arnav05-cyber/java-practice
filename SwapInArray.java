package Mainest.Arnav;

public class SwapInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr,1,3);
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        for (int i = 0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}

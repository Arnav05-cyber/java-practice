package Mainest.Arnav;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);

    }

    static void rev(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}

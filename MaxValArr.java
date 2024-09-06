package Mainest.Arnav;

public class MaxValArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,55,6,43};
        max(arr);
    }
    static void max(int[] arr){
        int max = 0;
        for(int i = 0; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

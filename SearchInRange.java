package Mainest.Arnav;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        int target = input.nextInt();
        int[] arr = {1,2,3,4,5,6};
        search(arr,start,end,target);
    }
    static void search(int[]arr, int s, int e, int t){
        int i = s;
        while (i<e) {
            if (arr[i] == t) {
                System.out.println(i);
            }
            else{
                System.out.println("Element not in range");
                break;
            }
            i++;
        }
    }
}

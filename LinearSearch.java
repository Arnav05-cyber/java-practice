package Mainest.Arnav;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int index = input.nextInt();
        search(arr,index);
    }
    static void search(int[] arr, int index){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == index){
                System.out.println("The searched number is on index: "+i);
            }
            else{
                System.out.println("-1");
                break;
            }
        }
    }
}

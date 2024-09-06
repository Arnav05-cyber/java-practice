package Mainest.Arnav;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] num = new int[3][3];
        int[][] arr2d = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        for (int row = 0; row <num.length; row++){
            for (int col = 0; col < num[row].length; col++){
                num[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row <num.length; row++){
            for (int col = 0; col < num[row].length; col++){
                System.out.print(num[row][col] + " ");
            }
            System.out.println();
        }
    }
}

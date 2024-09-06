package Mainest.Arnav;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        int n2 = input.nextInt();
        int count = 0;
        while (n>0){
            c = n%10;
            if (c == n2){
                count+=1;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

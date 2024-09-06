package Mainest.Arnav;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        while (n>0){
            int r = n%10;
            a = (a*10)+r;
            n = n/10;
        }
        System.out.println(a);
    }
}

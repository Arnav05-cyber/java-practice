package Practice_1;

import java.util.Scanner;

public class Fibonachi_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 2;
        System.out.println(a);
        System.out.println(b);
        while(count<=n){
           c = b;
           b = a+b;
           a = c;
           System.out.println(b);
           count++;
        }

    }





}

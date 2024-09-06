package Mainest.Arnav;

import java.util.Scanner;

public class prime_using_funciton {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        int s = 1;
        int f = 0;
        while (s<n){
            if(n%s == 0){
                f+=1;
            }
            s+=1;

        }
        if (f == 1){
            return true;
        }
        else{
            return false;
        }

    }


}

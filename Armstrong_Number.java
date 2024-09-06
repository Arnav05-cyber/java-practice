package Mainest.Arnav;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 100;
        int b = 1000;
        armstrong(a,b);
    }
    static void armstrong(int a,int b){
        int temp = a;
        while (temp <= b) {
            int digits = 0;
            int onumber = temp;
            int n = temp;
            double sum = 0;
            while(n>0){
                digits = n%10;
                sum = sum + Math.pow(digits,3);
                n = n/10;
            }
            if (sum == onumber){
                System.out.println(onumber);
            }
            temp+=1;
        }
    }
}

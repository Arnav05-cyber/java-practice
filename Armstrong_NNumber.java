package Practice_1;

import java.util.Scanner;

public class Armstrong_NNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int r = num1;
        while (r <= num2) {
            int number = r;
            int onumber = r;
            int ans = 0;

            while(number>0) {
                int digit = number%10;
                ans += Math.pow(digit,3);
                number /= 10;
            }
            if(ans == onumber){
                System.out.println(onumber);
            }
            r++;

        }

    }
}
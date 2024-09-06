package Practice_1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int i = 1;
        int fac = 1;
        while (i<=num){
            fac = fac*i;
            i++;
        }
        System.out.println(fac);
    }
}
